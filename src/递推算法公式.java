import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/07/10/18:07
 * @Description:
 */

public class 递推算法公式 {
    //递推算法采用的是fibonacci数列为例子
    public static int fibonacci(int n){
        int t1, t2;
        if (n==1 || n==2){
            return 1;
        }else {
            t1 = fibonacci(n-1);
            t2 = fibonacci(n-2);
            return t1+t2;
        }
    }

    public static void main(String[] args) {
        System.out.println(" 递推算法求解兔子个数问题！");

        System.out.println("请输入时间：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num =fibonacci(n);
        System.out.println("经过"+n+"个月后，兔子的个数为："+num+"只");
    }
}
