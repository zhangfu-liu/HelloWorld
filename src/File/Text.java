package File;

import java.io.*;

/**
 * @Author AT-zfc
 * @Since 2020-04-21 17:52
 */
public class Text {
    public static void main(String[] args) {
        Member member = new Member("蔡徐坤", "18");
        // 序列化
        byte[] serialize = serialize(member);
        // 反序列化
        Member deserialize = deserialize(serialize);
        // 打印结果
        System.out.println(deserialize);
    }

    public static byte[] serialize(Member member) {
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream (); ObjectOutputStream objectOutputStream = new ObjectOutputStream (byteArrayOutputStream);){
            objectOutputStream.writeObject (byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Member deserialize(byte[] bytes) {
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (bytes); ObjectInputStream objectInputStream =new ObjectInputStream (byteArrayInputStream)) {
           return (Member)objectInputStream.readObject ();



        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static class Member implements Serializable {

        private final String name;
        private final String age;
        public Member(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Member{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

}
