package IntroAJavaTT;

import java.util.regex.Pattern;

public class PasswordSimple extends Password{
    private static final String s = "^.{4,10}$";
    public PasswordSimple() {
        super(s);
    }
}
