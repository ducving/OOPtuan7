package bt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lop {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Class_REGER="^[ACP]\\d{4}[GHIK]";
    public  Lop(){
        pattern=Pattern.compile(Class_REGER);

    }
    public Boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
