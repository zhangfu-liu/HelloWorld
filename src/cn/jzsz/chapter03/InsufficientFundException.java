package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 22:12
 */
public class  InsufficientFundException extends Exception {
    public InsufficientFundException(){
        super();
    }
    public InsufficientFundException(String name){
        super(name);
    }

}