package validate;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:24
 */
public class CardVld extends  GenericValidate{

    public CardVld(Object[] inner, Object input) {
        super (inner, input);
    }
    public  boolean check(){
        String instr =null;
        if (this.getInner ()!=null && this.getInner ()!=null){
            try {
                instr = ((String) this.getInput ()).substring (2);
            } catch (Exception e) {
                System.out.println ("验证胸卡失败");
            }

        }
        for (int i =0 ; i<this.getInner ().length;i++){
            if(instr.equals (this.getInner ()[i])){
                return true;
            }

        }
            return false;
    }
}
