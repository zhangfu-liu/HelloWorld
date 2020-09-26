package example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author AT-zfc
 * @Since 2020-05-15 13:39
 */
public class Dome {
    public static void main(String[] args) {
        ArrayList list= new ArrayList ();
        for (int i = 0; i <5 ; i++) {
            list.add ("我是"+i+"个元素");
        }
        Iterator it =list.iterator ();
        while (it.hasNext ()){
            String str =(String)it.next ();
            System.out.println (str);
        }
    }

}
