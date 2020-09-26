package qq.com.q1816894130.helloworld;

import com.sun.javafx.image.BytePixelSetter;
import jdk.nashorn.internal.ir.IfNode;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Example09 {

    public static void main(String[] args) {
        System.out.println("你要输入的数字为");
        String in = new Scanner(System.in).next();
        if (in.equals("大") || in.equals("小")) {
            System.out.println("你猜的内容为"+in );
            int num = new Random().nextInt(6) + 1;
            System.out.println("随机得到的数字为" + num);
            if (in.equals("大") && num >= 4) {
                System.out.println("你猜对了");
            } else if (in.equals("小") && num <= 3) {
                System.out.println("去他妹");
            }

        }else {
            System.out.println("你输入的格式不合法");
        }
    }


}

