package Class;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @Author AT-zfc
 * @Since 2020-06-23 22:17
 */
public class DAteMoTest {
    public static void main(String[] args) throws IOException {
        //创建serversocket对象给系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket (8880);
        //使用serversocket对象中的方法accept获取请求客户端对象socket
        Socket socket= serverSocket.accept ();
        //使用socket对象中的方法getinputstream（）获取网络字节输入流inputstream
        InputStream inputStream = socket.getInputStream ();
        //使用网络字节输入流inputstream对象中的方法read读取客户端发送的数据
        byte[]bytes =new byte[1024];
        int len = inputStream.read (bytes);
        System.out.println (new String (bytes,0,len));
        //使用socket 对象中的方法getoutputstream（）获取网络字节的输出流
        OutputStream outputStream = socket.getOutputStream ();
        //使用网络字节输出流outputstream对象中的方法write，给客户端会写数据
        outputStream.write ("收到了谢谢".getBytes ());
        serverSocket.close ();
        socket.close ();

    }

}
