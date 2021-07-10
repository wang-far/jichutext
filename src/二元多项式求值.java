import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/07/04/18:39
 * @Description:
 */

public class 二元多项式求值 {
//    x从0到4次
//    y从0到5次
  /*  4*5的系数矩阵为
  1.0 2.0 3.0 4.0 5.0
  6.0 7.0 8.0 9.0 10.0
  11.0 12.0 13.0.14.0 15.0
  16.0 17.0 18.0 19.0 20.0

  可以先把 系数 和X 计算出来作为y的系数
   */
    static double solve(double a[][],int m,int n,double x,double y){
      int i,j;
      double result,temp,tt;
      result = 0.0;
      tt = 1.0;
      for(i=0;i<m;i++){
          temp = a[i][n-1]*tt;
          for (j=n-2;j>=0;j--){
              temp = temp*y + a[i][j]*tt;
          }
          result += temp;
          tt *= x;

      }
      return  result;
    }

    public static void main(String[] args) {
        double result;
        double x,y ;
        DecimalFormat df = new DecimalFormat("0.000E000");
        double a[][]= {
                {1.0,2.0,3.0,4.0,5.0},
                {6.0,7.0,8.0,9.0,10.0},
                {11.0,12.0,13.0,14.0,15.0},
                {16.0,17.0,18.0,19.0,20.0}
        };
        x=0.5;
        y=2.0;
        System.out.println("二元多项式求值：");

        result =  solve(a,4,5,x,y);
        System.out.println("P("+x+","+y+")="+df.format(result));
    }

}
