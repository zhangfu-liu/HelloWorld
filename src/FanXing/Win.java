package FanXing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author AT-zfc
 * @Since 2020-04-28 15:16
 */
public class Win<T> {
    Random random =new Random ();
    public T  win;
        ArrayList<T> arrayList= new ArrayList<> ();
        public  void  addWin( T y){
            arrayList.add (y);

    }

    public T getWin() {
            win=arrayList.get (random.nextInt (arrayList.size ()));
            return win;

    }
}
