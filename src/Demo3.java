import java.io.*;

/**
 * @program: JavaDemo
 * @Date: 2018/9/29 14:29
 * @Author: XuMian
 * @Description:字节流读取文本
 */
public class Demo3 {
    public static void main(String[] args) {
        File file = new File("d:"+File.separator+"b.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            inputStream.close();
            System.out.println(new String(bytes,0,len));
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
