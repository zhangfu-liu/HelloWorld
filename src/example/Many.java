package example;

import java.util.ArrayList;

/**
 * @Author AT-zfc
 * @Since 2019-11-28 23:14
 */
public class Many {
    public static void main(String[] args) {
        ArrayList<Pot> list =new ArrayList<> ();
        list.add (new Pot ("黎明",18));
        list.add (new Pot ("你爹",11));
        list.add (new Pot ("嚣张",19));
        list.add (new Pot ("小张",10));
        list.add (new Pot ("小红",20));
        list.add (new Pot ("撒打算",8));
        list.sort ((o1, o2) -> o2.age-o1.age);
        System.out.println (list);
        list.forEach (temp->{
            System.out.println (temp);
        });
        list.removeIf (ele->ele.age>10);
        System.out.println (list
        );




    }




}

