package bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private static final String PHONE_REGEX="^[84]+[0-9]{5,}";
    public Phone(){}
    public boolean valiPhone(String REGEX){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher=pattern.matcher(REGEX);
        return matcher.matches();
    }
}
