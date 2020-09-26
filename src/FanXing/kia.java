package FanXing;

/**
 * @Author AT-zfc
 * @Since 2020-04-28 15:25
 */
public class kia {
    public static void main(String[] args) {
        Win<String> c = new Win<> ();
        String[] strings ={"我当你爹","我是你爸爸","恭喜获得儿子称号","苹果肾","长高十厘米"};
        for (int i = 0; i< strings.length; i++){
             c.addWin (strings[i]);
        }
        String s = c.getWin ();
        System.out.println ("您获得奖品为"+s);
    }

}
