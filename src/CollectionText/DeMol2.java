package CollectionText;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author AT-zfc
 * @Since 2020-05-09 16:56
 */
public class DeMol2 {
    public static void main(String[] args) {
       String str  ="asdasdashdaksmcklsmknvaoidhaiuhdannvna";
       char[]chs= str.toCharArray ();
       Map<Character, Integer> mao= new TreeMap<> ();
       for (char tem: chs){
            Integer vlu=mao.get (tem);
            if (vlu==null){
                mao.put (tem,1);
            }else {
                vlu++;
                mao. put (tem,vlu);
            }
       }
       mao.forEach ((k,v)->{
           System.out.println (k +"="+v);
       });

    }

}
