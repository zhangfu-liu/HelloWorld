package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 21:58
 */
public class Test1 {
    public static void main(String[]args) throws NoThisSongException {
       try {
           Player player= new Player();
           Player.play(15);
           System.out.println("你输入的歌曲索引值为"+player.toString());
       }
       catch (NoThisSongException e){
           System.out.println(e.getMessage());
       }


    }

}
    class Player{
public static void play(int index)throws NoThisSongException{
        if (index>10){
            throw new NoThisSongException("你播放的歌曲不存在");
        }

        }



        }
