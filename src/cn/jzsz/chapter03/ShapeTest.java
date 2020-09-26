package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-07 9:14
 */
class Shape{
    String color;
    public Shape(){

    }
    public Shape(String color){
        this.color =color;
    }
    public void setColor(String color){
        this.color = color;

    }
    public String getColor(String color){
        return  this.color;
    }
}
class Circle extends Shape{
    int r;
    public  Circle(String color,int r ){
        super(color);
        this.r = r ;
    }
    public void show(){
        System.out.println("半径为"+r+"颜色为"+super.color);
    }
    public  void setR( int r){
        this.r = r;

    }
    public int getR(int r){
       return this.r  ;

    }
}
class Rectangle extends  Shape{
    double a;
    double b;
    public  Rectangle(double a,double b,String color){
        super(color);
        this.a =a ;
        this.b = b;

    }
    public double b(double b){
        return  this.b;
    }
    public double a(double a){
        return this.a;

    }
    public void setB(double b){
        this.b = b;
    }
    public void setA(double a){
        this.a = a;

    }
    public void show(){
        System.out.println("你的宽度为"+a+"你的高度是" +b + "你的颜色"+color);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Circle c= new Circle("red",11);
        Rectangle rectangle= new Rectangle(2.0,2.0,"红色");
        c.show();
        rectangle.show();

    }

}
