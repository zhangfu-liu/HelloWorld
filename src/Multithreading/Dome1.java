package Multithreading;

/**
 * @Author AT-zfc
 * @Since 2020-05-16 13:28
 */
public class Dome1 {
    public static void main(String[] args) {
        Exa  exa =new Exa ();
        Thread exathread1 =new Thread ( exa,"一号窗口");
        Thread exathread2 =new Thread ( exa,"二号窗口");
        Thread exathread3 =new Thread ( exa,"三号窗口");
        Thread exathread4 =new Thread ( exa,"四号窗口");
        exathread1.start ();
        exathread2.start ();
        exathread3.start ();
        exathread4.start ();
    }

}
