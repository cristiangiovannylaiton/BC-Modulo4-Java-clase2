package IntroAJavaTT;

public class PasswordFuerte extends Password{
    private static final String s = "^(?=.*[0-9])"
                                    + "(?=.*[a-z])(?=.*[A-Z])"
                                    + "(?=.*[!@#$%^&+=])"
                                    + "(?=\\S+$).{8,40}$";
    public PasswordFuerte() {
        super(s);
    }
}
