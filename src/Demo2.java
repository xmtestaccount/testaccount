import java.io.*;

/**
 * @program: JavaDemo
 * @Date: 2018/9/29 14:13
 * @Author: XuMian
 * @Description:字节流捕捉异常
 */
public class Demo2 {
    public static void main(String[] args) {
        File file = new File("d:"+ File.separator+"b.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file,true);//为true时像文本追加内容
            String str = "111";
            byte[] bytes = str.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
