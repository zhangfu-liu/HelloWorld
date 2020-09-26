package CollectionText;

import java.util.*;

/**
 * @Author AT-zfc
 * @Since 2020-05-11 16:45
 */
public class MovieManager {
    public static void main(String[] args) {
        List<Movie> list  =new ArrayList<> ();
        Map<Integer,String> map =new HashMap<> ();
        System.out.println ("1.添加电影");
        System.out.println ("2.查看电影种类");
        System.out.println ("3.分类管理");
        System.out.println ("4.现实人气最高电影");
        System.out.println ("请选择");
        Scanner s = new Scanner (System.in);
        int num=s.nextInt ();
        int count =1;
        switch (num){
            case 1:
                System.out.println ("请输入电影名称：");
                String name=s.next ();
                System.out.println ("请输入电影类型:");
                String type =s.next ();
                System.out.println ("请输入电影人气：");
                int donny = s.nextInt ();
                Movie movie =new Movie (name,type,donny);
                list.add (movie);
                boolean b=map.containsValue (type);
                if (!b){
                    map.put (count,name);
                    count++;
                }


                break;
            case 2:
                System.out.println ("查看电影列表");
                list.forEach (temp->{
                    System.out.println (temp+"\n");
                });
                 Integer mun=s.nextInt ();
                 String type1=map.get (mun);
                for (Movie temp: list) {
                    String s1=  temp.getType ();
                    if (mun.equals (s1)){
                        System.out.println (temp+"\n");
                    }


                    
                }

                break;
            case 3:
                System.out.println ("请选择分类");
                map.forEach ((k,v)->{
                    System.out.println (k+","+v);

                });




                break;
            case 4:
                Movie movie1 =list.get (0);
                for (int i=1;i< list.size ();i++){
                     int i1=movie1.getDonny ();//读取movie里的人气
                     Movie m =list.get (i);
                     int j = m.getDonny ();
                     if (i1<j){
                         movie1=m;

                     }
                    System.out.println (movie1);
                }
                break;



        }

    }

}
