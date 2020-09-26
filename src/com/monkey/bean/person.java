package com.monkey.bean;

/**
 * @Author AT-zfc
 * @Since 2020-04-02 12:55
 */
public class person {
    private String  name;
    private int  age;
    public person(){

    }
    public person(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return  name;
    }
    public void setAge(){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(){
        this.name = name;
    }
    //重写toString方法 ；
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
