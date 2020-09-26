package File;

import java.io.*;

/**
 * @Author AT-zfc
 * @Since 2020-04-20 19:39
 */
public class Inputted {
    public static void main(String[] args) {
      /*  File file = new File("D://word.txt");
        try {
            long stm = System.currentTimeMillis();
            FileInputStream fls = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("D:\\exe.txt");

            int ch = 0;
            while (( ch= fls.read())!=-1){
                fos.write(ch);
            }
            fls.close();
            fos.close();
            long end = System.currentTimeMillis();
            System.out.println("你最后的时间为"+(end-stm)+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }

//实现一个文件的内容复制到另一个文件
**/
        try {
            long start =System.currentTimeMillis ();
            FileInputStream its = new FileInputStream ("D:\\exe.txt");
            BufferedInputStream bf =  new BufferedInputStream (its);
            byte[] by = new  byte[1024];
            int len =0;
            while ((len=bf.read ())!=-1){
                System.out.println (len);

            }
            its.close ();
            bf.close ();
            long end =System.currentTimeMillis ();
            System.out.println ("你所消耗的时间为"+ (end-start)+"ms");



        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}