/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/07/04/11:55
 * @Description:
 */

public class 矩阵运算 {
    static void matrixplus(double A[][], double B[][], int m, int n, double C[][]) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public static void main(String[] args) {
        double A[][] = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        double B[][] = {
                {2.0, -2.0, 1.0},
                {1.0, 3.0, 9.0},
                {19.0, -3.0, 7.0}
        };
        double[][] C = new double[3][3];
        int m, n, i, j;
        m = 3;
        n = 3;
        System.out.println("result= ");
        matrixplus(A, B, m, n, C);
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
