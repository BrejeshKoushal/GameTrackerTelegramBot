package Practice;

import java.net.MalformedURLException;
import java.net.URL;

public class Huh {
    public static void main(String[] args) throws MalformedURLException {
        StringBuilder sb = new StringBuilder();
        sb.append("222");
        sb.append("22");
        char ch = '1';
        if(Character.isDigit(ch)){
            System.out.println("adfafa");
        }
        System.out.println(Integer.parseInt(String.valueOf(ch)));
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
