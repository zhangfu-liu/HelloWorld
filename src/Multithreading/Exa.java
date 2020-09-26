package Multithreading;

/**
 * @Author AT-zfc
 * @Since 2020-05-16 13:28
 */
public class Exa implements  Runnable {
    private  int index= 0;
    private final  static  int max =100;

    @Override
    public void run() {
        while (index<=max) {
            System.out.println (Thread.currentThread () + "的号码是" + (index++));

            try {
                Thread.sleep (100);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}
