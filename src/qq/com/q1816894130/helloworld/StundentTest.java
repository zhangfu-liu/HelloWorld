package qq.com.q1816894130.helloworld;

import javax.naming.Name;

/**
 * @Author AT-zfc
 * @Since 2020-03-23 8:48
 */
 class Student{
    private String name;
     private int age;
     public Student(){
         System.out.println("我是一个路人，但是我想介绍我一下");

     }
     public Student(String name, int sage){
         this();
         this.name=name;
         this.age=sage;

     }
     public String getName() {
             return this.name;

     }
     public void setName(String name){
        this. name=name;
     }
     void jiaoshi(){
         System.out.println("我的名字是"+ this.name + ",我的年龄是"+this.age+"岁了");

    }
     void lei(){
         this.jiaoshi();
         System.out.println("哦！hello,"+this.name);
    }


}
public class StundentTest {
     public static void main(String[]args){
         Student stu =new Student("张副才",19);
        stu.lei();



     }

}
