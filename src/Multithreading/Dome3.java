package Multithreading;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @Author AT-zfc
 * @Since 2020-05-20 16:37
 */
public class Dome3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread (()->{
            IntStream.range (1,100).forEach (i->{
                System.out.println (Thread.currentThread ().getName ()+"->"+i);
            });

        });
        Thread t2 = new Thread (()->{
            IntStream.range (1,100).forEach (i->{
                System.out.println (Thread.currentThread ().getName ()+"->"+i);
            });

        });
        t1.start ();
        t2.start ();
        t1.join ();
        t2.join ();
        System.out.println ("输出下一个");
        IntStream.range (1,1000).forEach (i->{
            System.out.println (Thread.currentThread ().getName ()+"a"+i);
        });

    }

}
