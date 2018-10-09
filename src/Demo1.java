import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: JavaDemo
 * @Date: 2018/9/29 11:04
 * @Author: XuMian
 * @Description:字节流抛出异常操作
 */
public class Demo1 {
public static void main(String[]args) throws IOException {
        File file = new File("d:"+File.separator+"text.txt");
        OutputStream outputStream = new FileOutputStream(file);
        String str = "123";
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }
}
