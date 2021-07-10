import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/07/10/14:39
 * @Description:
 */

public class 穷举算法思想 {
    static int chichen, habbit; //chichen代表鸡的个数  habbit代表兔子的个数

    public static int qiongju(int head, int food) {
        int re, i, j;
        re = 0;
        for (i = 0; i <= head; i++) {
            j = head - i;
            if (i * 2 + j * 4 == food) {
                re = 1;
                chichen = i;
                habbit = j;

            }
        }
        return re;

    }

    public static void main(String[] args) {
        int re, head, food;
        System.out.println("穷举法求解鸡兔同问题");
        System.out.println("请输入头个数");
        Scanner sc = new Scanner(System.in);
        head = sc.nextInt();
        System.out.println("请输入头脚个数");
        food = sc.nextInt();
        re = qiongju(head, food);
        if (re == 1) {
            System.out.println("鸡有" + chichen + "只， 兔有" + habbit + "只");
        } else {
            System.out.println("无法求解");
        }

    }
}