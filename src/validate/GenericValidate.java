package validate;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:26
 */
public class GenericValidate implements Validate {
    private Object[]inner;//系统已有的信息；
    private  Object input;//需要验证的信息；


    public  GenericValidate(Object[] inner,Object input){
        this.input=input;
        this.inner=inner;
        }




//比较方法的默认实现
    public boolean check() {
        for (int i=0;i<this.getInner ().length;i++){
            if (this.getInput ()!=null && this.getInput ().equals (this.getInner ()[i])){
                return true;
            }
        }

        return false;
    }



    public Object[] getInner() {
        return inner;
    }

    public GenericValidate setInner(Object[] inner) {
        this.inner = inner;
        return this;
    }

    public Object getInput() {
        return input;
    }

    public GenericValidate setInput(Object input) {
        this.input = input;
        return this;
    }

    public GenericValidate(Object input, Object[] inner){
        this.inner=inner;

    }
}
