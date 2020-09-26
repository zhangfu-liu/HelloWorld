package qq.com.q1816894130.helloworld;

import java.util.Arrays;
import java.util.Base64;

public class Text {
    public static void  main(String []args){
        String  x = "" ;
        System.out.println(Base64.getEncoder().encodeToString(x.getBytes()));

        for (char c : x.toCharArray()) {
            System.out.println((int) c);
            System.out.println(((char) (int) c));
        }
    }

}
