package Multithreading;

/**
 * @Author AT-zfc
 * @Since 2020-05-13 18:14
 */
public class Dome {
    public static void main(String[] args) {
        new Thread ("第一个线程"){
            @Override
            public void run(){
                read ();
            }

        }.start ();
        new Thread ("第二个线程"){
            @Override

            public void run(){
                write ();

            }
        }.start ();
    }
    private  static  void read(){
        try {
            System.out.println ("开始读");
            Thread.sleep (1000*10L);
            System.out.println ("正在读");
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("处理成功");

    }
    private static void write(){
        try {
            System.out.println ("开始写");
            Thread.sleep (1000*10L);
            System.out.println ("正在写");

        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("处理成功");
    }


}
