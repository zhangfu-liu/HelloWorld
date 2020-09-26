package qq.com.q1816894130.helloworld;

import javax.naming.Name;

public class Easdas {
    int i = 47;

    public void call() {
        System.out.println("调用call（）方法");
        for (i = 0; i < 3; i++) {
            System.out.println(i + "");
            if (i == 2) {
                System.out.println("\n");
            }

        }
    }

    public Easdas() {

    }

    public static void main(String[] args) {
        Easdas t1 = new Easdas();
        Easdas t2 = new Easdas();
        t2.i = 60;
        System.out.println("第一个实力对象调用变量i的结果：" + t1.i++);
        t1.call();
        System.out.println("第二个是对象调用变量i的结果:" + t2.i);
        t2.call();


    }

}
