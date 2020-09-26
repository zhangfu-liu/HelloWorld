package qq.com.q1816894130.helloworld;

import java.sql.Struct;
import java.time.Year;
import java.util.function.IntConsumer;

/**
 * @Author AT-zfc
 * @Since 2020-02-28 17:23
 */
public class Cleary {
    public static void  main(String[]args){
        double pi=Math.PI;
        int sun= add(4);
        int sun1=add(6,4);
        System.out.println("圆的面积为："+ pi*sun+"cm");
        System.out.println("矩形面积为："+sun1+"cm");

    }
    public static int add( int x){


        return x*x;
}
    public static int add(int c, int k){
        return c*k;
    }



}