package IntroAJavaTT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private Pattern regex;
    private String value;

    public Password(String s) {
        this.regex = Pattern.compile(s);
    }

    public Pattern getRegex() {
        return regex;
    }

    public void setRegex(Pattern regex) {
        this.regex = regex;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        Matcher m =this.regex.matcher(value);
        if(m.matches()) {
            this.value = value;
        }else {
            throw new RuntimeException("La contraseña no cumple con la expresion regular");
        }
    }
}
