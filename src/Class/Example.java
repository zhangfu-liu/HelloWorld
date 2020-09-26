package Class;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @Author AT-zfc
 * @Since 2020-04-23 17:05
 */
public class Example {
     public static void main( String[]args) throws Exception {
         Class person = Person.class;
         Field a = person.getField("a");
         Person p  = new Person() ;
         Object value = a.get(p);
         System.out.println(value);
         a.set(p,"张三");
         System.out.println(p);
         System.out.println("-----------------------------------");
          Field[] declaredFields=person.getDeclaredFields ();
          for (Field  field: declaredFields);
          System.out.println (declaredFields);



         }
     }


