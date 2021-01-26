package IntroAJavaTT;

public class PasswordIntermedia extends Password {
    private static final String s = "(?=.*[a-z])(?=.*[A-Z])"
                                    + "(?=\\S+$).{6,20}$";
    public PasswordIntermedia() {
        super(s);
    }
}
