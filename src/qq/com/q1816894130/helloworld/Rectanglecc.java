package qq.com.q1816894130.helloworld;

/**
 * @Author AT-zfc
 * @Since 2020-03-24 10:54
 */
class Rectangle{
    private double width;
    private double height;
    private  String color = "红色";
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return this.height;

    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getarea(){
        return width*height;
    }

}
public class Rectanglecc {
    public static void main(String []args){
        Rectangle ren = new Rectangle(3.0,3.0);
        System.out.println("面积为"+ren.getarea());

    }

}
