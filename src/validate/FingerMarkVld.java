package validate;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:25
 */
public class FingerMarkVld  extends GenericValidate{

    public FingerMarkVld(Object[] inner, Object input) {
        super (inner, input);
    }
    public  boolean check(){
        String inputStr = null;
        if ( this.getInput () !=null && this.getInner ()!=null){
            inputStr = ((String) this.getInput ()).substring (2);

        }
        for (int i=0;i<this.getInner ().length;i++ ){
            if (inputStr.equals (this.getInner ()!=null )){
                return true;
            }

        }


        return false;
    }
}
