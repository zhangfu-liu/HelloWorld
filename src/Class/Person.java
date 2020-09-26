package Class;

/**
 * @Author AT-zfc
 * @Since 2020-04-23 16:59
 */
public class Person {
    private String age;
    private  String name;
    private String a;
    private String b;

    public Person setA(String a) {
        this.a = a;
        return this;
    }

    public String getA() {
        return a;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a='" + a + '\'' +
                '}';
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
