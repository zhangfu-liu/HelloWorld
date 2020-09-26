package qq.com.q1816894130.helloworld;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.animation.Animation;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * @Author AT-zfc
 * @Since 2019-11-25 23:06
 */
//class Animal{
  //  public String toString() {
    //    return "这是一个动物骨....";
    //}

  //public class Example {
    //public static void main(String[]args){
      //  Animal animal=new Animal();
       //System.out.println(animal.toString());
    //}

     //   }

public class Example{
    public static void main(String[]args) {
        int[] arr = {1, 10, 51, 30, 40, 599};
        int max = getmax(arr);
        System.out.println("max=" + max);
    }
       static int getmax(int[]arr) {
           int max = arr[0];
           for (int x = 1; x < arr.length; x++) {
               if (arr[x] > max)
                   max = arr[x];
           }

           return max;

        }


    }