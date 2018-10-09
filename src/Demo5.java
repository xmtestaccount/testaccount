import java.util.Scanner;

/**
 * @program: JavaDemo
 * @Date: 2018/9/29 15:14
 * @Author: XuMian
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        String s = "";
        for (int i = chars.length-1;i>=0;i--){
            s += chars[i];
        }
        System.out.println(s);
    }
}
