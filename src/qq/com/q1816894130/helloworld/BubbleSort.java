package qq.com.q1816894130.helloworld;

import sun.awt.SubRegionShowable;

/**
 * @Author AT-zfc
 * @Since 2020-02-07 19:23
 */
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arry = {121, 123,155 , 180};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(arry);
    }

    public void sort(int[] arry) {
        for (int i = 1; i < arry.length; i++) {
            for (int j = 1; j <arry.length - i; j++) {
                if (arry[i]> arry[j+1]) {
                    int temp = arry[i];
                    arry[i] = arry[j +1];
                    arry[j+1] = temp;
                }

            }
        }
        showArry(arry);
    }


    public void showArry(int[] arry) {
        for (int i : arry) {
            System.out.println(">" + i);
        }
    }
}