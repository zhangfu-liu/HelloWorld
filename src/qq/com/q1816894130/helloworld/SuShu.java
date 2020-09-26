package qq.com.q1816894130.helloworld;

import java.time.MonthDay;
import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2019-10-27 11:18
 */
public class SuShu {
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        System.out.println("请输入1-7的整数数，用来帮你翻译成中文");

        int sz= day.nextInt();
        switch (sz){
            case 1:
                System.out.println("MONDAY" );
               break;
            case 2:
                System.out.println(" TUESDAY");
                   break;
            case 3:
          System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println ("THURSDAY") ;
                break;
            case 5:
                System.out.println(" FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
                //张副才
        }

    }

}
