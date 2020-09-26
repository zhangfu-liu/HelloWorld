package CollectionText;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author AT-zfc
 * @Since 2020-04-19 11:08
 */
public class ListText {
    public static void main(String[] args) {
     /*  List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        int i =(int)(Math.random()*list.size());
        System.out.println("你随机生成了一个list列表中的元素元素为："+ list.get(i));
        String de = list.get(i);
        list.remove(de);
        System.out.println("你随机删除了一个元素，元素为"+ de);
        for (int j =0;j<=list.size();j++){
            System.out.println("你的元素为"+list.get(j));
        }

**/
     List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);

        }

    }

}
