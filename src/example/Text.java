package example;

/**
 * @Author AT-zfc
 * @Since 2019-11-28 23:58
 */
public class Text {
    public static void main(String[]args){
        System.out.println ("添加----------");
        add ();
        System.out.println ("删除----------");
        remove ();
        System.out.println ("修改----------");
        alter ();


    }
    public  static void  add(){
        StringBuffer str = new StringBuffer ("abcdefg");
        str.append ("ef");
        System.out.println ("你添加的后的字符串为" +str);
        str.insert (1,"dd");
        System.out.println ("在a后面添加字符串之后的为"+str);

    }
    public  static  void remove(){
        StringBuffer str1 = new StringBuffer ("abcdefg");
        str1.delete (0,2);
        System.out.println ("删除后的为"+str1);
    }
    public  static  void alter(){
        StringBuffer str2 = new StringBuffer ("abcdefg");
        str2.replace (5,7,"cc");
        System.out.println ("修改之后"+str2);

    }
}
