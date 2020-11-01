package Enum;

/**
 * @Author AT-zfc
 * @Since 2020-11-01 17:16
 */
public class Emu1 {
    public static void main(String[] args) {
        seanNn seannn= seanNn.fall;
        System.out.println (seannn);

    }



}

enum seanNn {

    spring("春天","春暖花开"),
    summer("夏天","夏日炎炎"),
    fall("秋天","秋高气爽"),
    winter("冬天","寒风刺骨");

    @Override
    public String toString() {
        return "seanNn{" +
                "seanNn='" + seanNn + '\'' +
                ", seanNm='" + seanNm + '\'' +
                '}';
    }

    private final String seanNn;
    private final String seanNm;

    public String getSeanNn() {
        return seanNn;
    }

    public String getSeanNm() {
        return seanNm;
    }

    seanNn(String seanNm, String seanNn) {
        this.seanNm = seanNm;
        this.seanNn = seanNn;


    }

}

