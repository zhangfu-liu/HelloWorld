package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @Author AT-zfc
 * @Since 2020-04-19 15:46
 */
public class FileTest {
    /*public static void main(String[] args) {//单个文件和 单个文件夹和文件文件夹包含一个文件夹
        try {
            File file1 = new File("D:\\x9504.text");
            boolean file  =file1.createNewFile();
            System.out.println(file?"创建成功":"创建失败");
            File file2 = new File("D:\\英雄联盟" );
            boolean filag = file2.mkdir();
            System.out.println( filag?"文件夹创建成功":"文件夹创建失败");
            File file3 =  new File("D:\\英雄时刻\\英雄文件\\英雄再现");
            boolean filag2 = file3.mkdirs();
            System.out.println(filag2?"多重文件创建成功":"多重文件创建失败");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
**/
    public static void ShoFile(File pathname)  {
        try {
            if (pathname.isDirectory()){
                for (File files : pathname.listFiles()){
                    ShoFile(files);
                    System.out.println("普通文件---------------" + pathname.getCanonicalPath());
                }


            }else {
                System.out.println("普通文件------------------"+pathname.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        ShoFile(new File("D://新建文件夹"));

    }

}

