package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 20:03
 */
interface Flyable{
     void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("我这个继承方法被实现了'");
    }
}
class Plane implements Flyable{
   public void fly(){
        System.out.println("我正好也继承了他");
    }
}
public class FlyableTest {
    public static void main(String[] args){
        Bird bird = new Bird();
        Plane plane = new Plane();

        bird.fly();  plane.fly();
    }

}
