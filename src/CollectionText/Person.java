package CollectionText;

/**
 * @Author AT-zfc
 * @Since 2020-05-09 19:35
 */
public class Person {
    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return this.name+"\t"+this.a+"\t"+this.age+"\t"+this.b+"\t";
    }

    public Person(String age, String name, String a, String b) {
        this.age = age;
        this.name = name;
        this.a = a;
        this.b = b;
    }

    private String age;
    private  String name;
    private String a;
    private String b;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setB(String b) {
        this.b = b;
        return this;
    }


    public Person setA(String a) {
        this.a = a;
        return this;
    }

    public String getA() {
        return a;
    }

    public Person() {

    }


    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public Person setAge(String age) {
        this.age = age;
        return this;
    }

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }


    public Person(String age) {
        this.age = age;
    }

}
