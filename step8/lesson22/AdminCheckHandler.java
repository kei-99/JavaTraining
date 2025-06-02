public class AdminCheckHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        if (request.isAdmin()) {
            System.out.println("Admin check passed.");
            System.out.println("Access granted: Admin access.");
        } else {
            System.out.println("Admin check skipped.");
            System.out.println("Access granted: Normal user access.");
        }
        super.handle(request);
    }
}
