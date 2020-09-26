package cn.jzsz.chapter03;
import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @Author AT-zfc
 * @Since 2020-03-24 11:06
 */
class Book{
    private String title;
    private int pageNum;
    private String type;
    public Book(String title,int pageNum){
        this.title = title;
        this.type ="计算机";
        this.pageNum=pageNum;
    }
    public Book(String title,int pageNum,String type){
        this.type=type;
        this.title=title;
        this.pageNum=pageNum;
    }
    public String getTitle(){
        return this.title=title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getPageNum(){
        return this.pageNum;

    }
    public void setPageNum(int pageNum){
        this.pageNum=pageNum;
    }


    public void detail(){
        System.out.println("你看的为"+this.title+"页数是"+this.pageNum+"页"+"内容为"+this.type);
    }


}
public class BookTest {
    public static void main(String[]args) {
        Book c1 = new Book("《综合知识回顾》",1200);
        Book c2 = new Book("《沙雕故事书》",12,"园林的彩票，");
        c1.detail();
        c2.detail();

    }
}