package CollectionText;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2020-05-09 17:40
 */
//fori可以快速程程for循环 sout 可以快速生成输出方法  iter 可以快速生成遍历数组；
public class Demo3 {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap< String, Person> ();
        for (;   ; ) {
        System.out.println ("*******************************************************");
        System.out.println ("信息录入");
        System.out.println ("信息查询");
        System.out.println ("信息修改");
        System.out.println ("信息删除");
        System.out.println ("退出");
        System.out.println ("*******************************************************");
        System.out.print("请输入您的选项");
        Scanner sc =new Scanner (System.in);
        int num =sc.nextInt ();
        switch (num){
            case 1:
                System.out.println ("开始录用公民信息:");
                System.out.print ("(1)请您输入姓名:");
                String name = sc.next();
                System.out.print ("(2)请您输入身份证号:");
                String age= sc.next ();
                System.out.print("(3)请您输入性别:");
                String xing= sc.next ();
                System.out.print("(4)请您输入地址:");
                String dizhi = sc.next ();
                Person person =new Person (name,age,xing,dizhi);
                map.put (age,person);
                break;
            case 2:
                System.out.println ("所有人信息列表如下:");
                map.forEach ((k,v)->{
                    System.out.println (v);

                });
                break;
            case 3:
                System.out.println ("信息修改：");
                System.out.print ("请输入你要修改的身份证号:");
                String sfzf= sc.next();
                System.out.println ("请输入你要修改的姓名:");
                String xingming = sc.next ();
                System.out.println ("请输入你要修改的性别:");
                String xingbie =sc.next ();
                System.out.println ("请输入你要修改的地址:");
                 String dizhi2 =sc.next ();
                 Person p = map.get (sfzf);
                 p.setAge (sfzf);
                 p.setA (xingming);
                 p.setB (xingbie);
                 p.setName (dizhi2);


                break;

            case 4:
                System.out.println ("开始信息删除:");
                System.out.println ("请输入你要删除的身份证号");
                String sfzh = sc.next ();
                map.remove (sfzh);
                break;
            case 5:
                System.exit (0);
                break;
            default:
                System.out.println ("不符合");
        }
    }


    }


}
