package CollectionText;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author AT-zfc
 * @Since 2020-05-07 15:24
 */
public class Demo1 {
    public static void main(String[] args) {
        /*Scanner s = new Scanner (System.in);
        System.out.println ("请你输入五位学生的成绩：");
        List<Float> list = new ArrayList<Float> ();
        float s1 =0F;
        for (int i =0; i<5;i++){
           float sc =s.nextFloat ();
           s1+=sc;
           list .add (sc);
        }
        Collections.sort (list);

        int index =list.size ()-1;

        float max = list.get (index);
        System.out.println ("最大值为"+ max);
        System.out.println ("平均值为"+(s1)/5);
        System.out.println ("最后从小到大排序的顺序为"+list);
        **/
        String[] art ={"qwertuiopasdfghjklzxcvbnm"};
        List<String> list = Arrays.asList (art);
        Collections.sort (list);
        list.forEach (temp->{
            System.out.println (temp+"\t");
        });
        Collections.reverse (list);













    }

}
