package validate;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:25
 */
public class PassWordVld  extends GenericValidate{

    public PassWordVld(Object input, String inner) {
        super ((Object[]) input, inner);
    }
    public  boolean check(){
        for ( int i =0; i<this.getInner ().length;i++){
            int innerInt=0;
            int inputInt=0;
            inputInt=Integer.parseInt (((String) this.getInput ()).substring (2));//从密码的第二位开始，解析密码
            if (this.getInner ()!=null) {
                innerInt = Integer.parseInt ((String) this.getInner ()[i]);//取回原有密码
            }
            if (innerInt!=0 && inputInt*2==innerInt){
                return true;


            }

        }
        return false;
    }

}
