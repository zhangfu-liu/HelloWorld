package Multithreading;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author AT-zfc
 * @Since 2020-05-16 17:57
 */
public class Dome2 {
    public static void main(String[] args) {
        Thread thread = new Thread () {
            public void run() {
                try {
                    Thread.sleep (100);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        };
        thread.start ();
        ThreadGroup threadGroup  =Thread.currentThread ().getThreadGroup ();
        System.out.println ( threadGroup.activeCount ());
         Thread[] threads = new  Thread[threadGroup.activeCount ()];
         threadGroup.enumerate (threads);
         for ( Thread temp: threads){
             System.out.println (temp);
         }

    }

}
