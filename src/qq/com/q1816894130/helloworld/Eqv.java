package qq.com.q1816894130.helloworld;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2019-10-21 23:58
 */
public class Eqv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请您输入一个成绩我来帮你识别属于哪个级别");
        int score = input.nextInt();
        switch (score / 10) {
            case 5:
                System.out.println("可以不及格海明是一个傻逼");
                break;
            case 6:
                System.out.println("以为及格了海明就不是傻逼了");
                break;
            case 7:
                System.out.println("虽然你考了70多但是海明变成了智障");
                break;
            case 8:
                System.out.println("可以 海明漏出了发际线");
                break;
            case 9:
                System.out.println("海明成功逆袭了");
                break;
            case 10:
                if (score == 100) {
                    System.out.println("可以海明已经不是海明了");
                    break;
                }


        }
    }

}

