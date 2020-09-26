package Class;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Author AT-zfc
 * @Since 2020-06-23 22:02
 */
public class DateMo {
    public static void main(String[] args) throws IOException {
       /*
       创建一个客户端对象socket，构造方法绑定服务器的ip
       地址和端口号
        */
        Socket socket= new Socket ("192.168.31.89",8880);
        //使用socket对象中的方法getoutputstream获取网络字节输出流outputStream对象
        OutputStream out = socket.getOutputStream ();
        //使用网络字节输出流OutputStream对象对的方法write给服务器发送数据。
        out.write ("你好服务器".getBytes ());
        //使用socket对象中的方法getinputstream（）获取网络字节输入流inputstream对象
        InputStream inputStream = socket.getInputStream ();
        //使用网络自己输入流inputstream对象中的read读取服务器会写数据
        byte[]bytes = new byte[1024];
        int len = inputStream.read (bytes);
        System.out.println (new String (bytes,0,len));

        //释放资源
        socket.close ();


    }


}
