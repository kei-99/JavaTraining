public class LoginRequest {
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean captchaValid;
    private boolean is2FAValid;

    public LoginRequest(String username, String password, boolean isAdmin, boolean captchaValid, boolean is2FAValid) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.captchaValid = captchaValid;
        this.is2FAValid = is2FAValid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isCaptchaValid() {
        return captchaValid;
    }

    public boolean is2FAValid() {
        return is2FAValid;
    }
}
