package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 18:58
 */
 abstract class Car{
     abstract void run();

}
class Bike extends Car{
     public void run(){
         System.out.println("我继承了抽象类");
     }

}
class Bus extends Car{
     public void run(){
         System.out.println("我也继承了抽象类");
     }
}

public class Testcar {
     public static void main(String[]args){
       Bike bike = new Bike();
       Bus bus = new Bus();
         bike.run();
         bus.run();

         }

}
