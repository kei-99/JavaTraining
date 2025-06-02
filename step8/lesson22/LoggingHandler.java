public class LoggingHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        System.out.println("[LOG] Handling request for user: " + request.getUsername());
        super.handle(request);
        System.out.println("[LOG] Finished handling request for user: " + request.getUsername());
    }
}
