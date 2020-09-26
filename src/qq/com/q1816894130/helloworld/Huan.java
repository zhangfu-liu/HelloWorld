package qq.com.q1816894130.helloworld;

import com.sun.xml.internal.bind.XmlAccessorFactory;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;
import sun.security.util.Length;

import java.time.Year;
import java.util.concurrent.ForkJoinPool;

/**
 * @Author AT-zfc
 * @Since 2019-11-02 23:32
 */
public class Huan {
    public int[][] changeTwocc(int[] a, int[] b) {
        //方法二 请假两个数组的地址引用直接互换
        int[] temp = a;
        a = b;
        b = temp;
        int[][]result={a,b};
        return  result ;
        //2.交换数组中的元素内的元素对应位置互换
        //方式一
        //for (int i = 0; i < a.length; i++) {//每次找到数组中的元素，并分配位置
        //int x = a[i];//来交换两个数组
        //a[i] = b[i];
        //b[i] = x;


    }

    public static void main(String[] args) {
        Huan d = new Huan();
        int[] x= {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8,10};//用来定义两个数组
        int[][]value=d.changeTwocc(x, y);
        x =value[0];
        y= value[1];
        for (int v : x) {
            System.out.println(v);
        }
        System.out.println("------------");
        for (int v : y) {
            System.out.println(v);

        }
    }

}
