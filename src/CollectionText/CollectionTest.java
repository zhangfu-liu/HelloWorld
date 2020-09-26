package CollectionText;

import com.monkey.bean.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author AT-zfc
 * @Since 2020-04-02 13:12
 */
public class CollectionTest {

    public static void main(String[] args) {

        Collection c = new ArrayList ();


        c.add (new person ("张三", 16));
        c.add (new person ("张六", 18));
        c.add (new person ("张四", 16));
        c.add (new person ("张五", 18));
       /* Iterator it = c.iterator();
       while (it.hasNext()){
            System.out.println(it.next());
        }
        */
        for (Iterator it = c.iterator (); it.hasNext (); ) {
            System.out.println (it.next ());

        }


    }

}
