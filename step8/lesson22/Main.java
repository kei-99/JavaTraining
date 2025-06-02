public class Main {
    public static void main(String[] args) {
        // ハンドラの作成
        AuthenticationHandler logger = new LoggingHandler();
        AuthenticationHandler captcha = new CaptchaCheckHandler();
        AuthenticationHandler username = new UsernameCheckHandler();
        AuthenticationHandler password = new PasswordLengthCheckHandler();
        AuthenticationHandler twoFA = new TwoFactorAuthHandler();
        AuthenticationHandler admin = new AdminCheckHandler();

        // チェーン接続
        logger.setNextHandler(captcha);
        captcha.setNextHandler(username);
        username.setNextHandler(password);
        password.setNextHandler(twoFA);
        twoFA.setNextHandler(admin);

        // テストケース 1: 管理者（全て有効）
        System.out.println("=== Test Case 1: Admin (All valid) ===");
        LoginRequest r1 = new LoginRequest("Alice", "securePass123", true, true, true);
        logger.handle(r1);

        // テストケース 2: 短いパスワード
        System.out.println("\n=== Test Case 2: Short Password ===");
        LoginRequest r2 = new LoginRequest("Bob", "123", false, true, false);
        logger.handle(r2);

        // テストケース 3: CAPTCHA 無効
        System.out.println("\n=== Test Case 3: CAPTCHA invalid ===");
        LoginRequest r3 = new LoginRequest("Charlie", "password123", false, false, false);
        logger.handle(r3);

        // テストケース 4: 管理者だが 2FA 無効
        System.out.println("\n=== Test Case 4: Admin but 2FA invalid ===");
        LoginRequest r4 = new LoginRequest("Dave", "adminpass123", true, true, false);
        logger.handle(r4);
    }
}
