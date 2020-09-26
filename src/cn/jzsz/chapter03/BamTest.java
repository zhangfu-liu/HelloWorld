package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 20:34
 */
interface Biology{
    public abstract void breath();

}
interface Animal{
    public abstract void sex();
    public abstract void eat();

}
interface Man extends Biology,Animal{
    public abstract void think();
    public abstract void  study();
}
class NormalMan  implements Man{
    public  void breath(){
        System.out.println("我是第一个接口方法");

    }
    public void set(){
        System.out.println("我是第二个接口方法");
    }

    @Override
    public void sex() {

    }

    public void eat(){
        System.out.println("巧了我也是第二个接口方法");
    }
    public void think(){
        System.out.println("不巧我是第三个接口方法");
    }
    public void study(){
        System.out.println("你不巧我巧 我们一样第三个接口方法");
    }


}
public class BamTest {
    public static void main(String[]args){
        NormalMan normalMan = new NormalMan();
        normalMan.breath();
        normalMan.set();
        normalMan.sex();
        normalMan.eat();
        normalMan.think();
        normalMan.study();

    }


}
