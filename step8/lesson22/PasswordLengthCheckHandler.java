public class PasswordLengthCheckHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        if (request.getPassword().length() < 8) {
            System.out.println("Password length check failed.");
            System.out.println("Access denied: Password must be at least 8 characters.");
            return;
        }
        System.out.println("Password length check passed.");
        super.handle(request);
    }
}
