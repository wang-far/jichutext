import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/06/25/9:44
 * @Description:递归算法
 */

public class 递归 {
    static long std1(int n){
        int a;
        long temp = 1;
        for(a=1;a<=n;a++){
             temp *= a;
        }
        return temp;
    }
    static long std2(int n){
        long temp = 1;
        if(n<=1)
            return 1;
        else
            return n*=std2(n-1) ;
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入该阶乘的大小");
        n1  = scanner.nextInt();
        System.out.println("大小为"+std1(n1));
        n2 = scanner.nextInt();
        System.out.println("n2为"+std2(n2));
    }


}
