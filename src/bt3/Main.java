package bt3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String a=scanner.next();
            scanner.close();
            a=a.replaceAll("\\n+","");
            Pattern pattern=Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher=pattern.matcher(a);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
