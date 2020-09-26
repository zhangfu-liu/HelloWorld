package cn.jzsz.chapter03;

import java.util.Arrays;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 21:33
 */
public class TestArray {
    public static void main(String[]args){
        int[] arr ={12211,2121,1215,131,12121,2,123121121};
       try {
           for (int i=1;i<arr.length;i++){
               System.out.println(Arrays.toString(arr));
               if (i<6){
                   System.out.println("over");
               }

           }

       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("下标越界");

       }
    }


}
