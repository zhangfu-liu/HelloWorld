package example;


import java.lang.reflect.Array;

public class Pot {
    @Override
    public String toString() {
        return "你的名字是"+name+"你的年龄是"+age;
    }

    public  String name;
    public  int age;

    public Pot(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println ("有参构造方法");
    }

    public Pot() {
        System.out.println ("无参构造方法");
    }
}