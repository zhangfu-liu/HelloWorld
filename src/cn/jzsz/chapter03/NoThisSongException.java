package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 21:45
 */
public class NoThisSongException extends Exception {
    public NoThisSongException(){
        super();
    }
    public NoThisSongException(String sorry){
        super(sorry);
    }

}

