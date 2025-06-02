public abstract class AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    public void setNextHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(LoginRequest request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
