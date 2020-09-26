package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-07 9:25
 */
class  Animalz{

    public void acc(){
        System.out.println("动物在吃东西");
    }
}
class Cat extends Animalz{
    public void acc(){
        System.out.println("猫在吃老鼠");
    }

}
public class AnimalTest {
    public static void main(String[]args){
        Animalz a = new Animalz();
        Cat c = new Cat();
        a.acc();
        c.acc();
    }

}
