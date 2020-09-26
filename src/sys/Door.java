package sys;

/**
 * @Author AT-zfc
 * @Since 2020-06-08 11:09
 */
//创建门
public class Door {
    public final static String OPEN=("门打开");
    public final static String CLOSE="门关闭";
    public  String start;

    public  String getOPEN() {
        return OPEN;
    }

    public  String getCLOSE() {
        return CLOSE;
    }

    public String getStart() {
        return start;
    }

    public Door setStart(String start) {
        this.start = start;
        return this;
    }

    public Door(){
        this.setStart (CLOSE);
    }
    public void close(){
        this.setStart (CLOSE);
    }
    public void  open(){
        this.setStart (OPEN);
    }


}
