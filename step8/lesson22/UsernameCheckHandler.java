public class UsernameCheckHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        if (request.getUsername().isEmpty()) {
            System.out.println("Access denied: Username cannot be empty.");
            return;
        }
        System.out.println("Username check passed.");
        super.handle(request);
    }
}
