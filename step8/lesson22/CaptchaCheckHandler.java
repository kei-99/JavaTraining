public class CaptchaCheckHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        if (!request.isCaptchaValid()) {
            System.out.println("CAPTCHA check failed.");
            System.out.println("Access denied: Invalid CAPTCHA.");
            return;
        }
        System.out.println("CAPTCHA check passed.");
        super.handle(request);
    }
}
