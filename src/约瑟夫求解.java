import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xiangqian
 * @Date: 2021/06/25/10:35
 * @Description:约瑟夫求解
 */

public class 约瑟夫求解 {
    //约瑟夫求解 给定确定的人进行计算 从编号为k的人进行数值第m个人出局
    //他的下一个人又开始从一开始 直到数到第m个人时出局
    //依次循环此条件 直到选出最后一个胜利者来
    static final int Num=41;//参与者的人数总和
    static final int Kill=3;//死亡数字，每数到3便自杀
    static void Josephus(int alive){
        int[] man=new int[Num];
        int count=1;
        int i=0,pos=-1;  //该人的编号
        while(count<=Num){
            do{
                pos=(pos+1)%Num;  //构建约瑟夫环，不断除以Num取余数，则pos永远是0-Num之间循环
                /*
                 * man[]只是一个大小为Num的数组，但是内容为空
                 * 在没进行赋值之前，所有的man[i]==0
                 * 这条语句的作用是不停的找到数组中没有赋值的元素位置，也就是还没有自杀的人
                 */
                if(man[pos]==0){
                    i++;
                }
                //如果i循环到死亡数字Kill,则i清零以便下次循环，同时退出当前while循环
                if(i==Kill){
                    i=0;
                    break;
                }
            }while(true);
            //为死亡者标上死亡次序count，count是从1到41的
            man[pos]=count;
            System.out.printf("第%2d个人自杀！是第%2d个自杀的",pos+1,man[pos]);
            System.out.print("     ");
            if(count%2!=1) System.out.println();
            count++;
        }
        System.out.println("\n");
        System.out.printf("这%d个想要存活下来的初始位置应排在以下序号：\n",alive);
        alive=Num-alive;//最后一个不想活的自杀次序
        /*
         * 遍历所有人，想要活下几个就找到死亡次序中最后几个对应的排列序号
         * 也就是对应的数组下标+1
         */
        for(i=0;i<Num;i++){
            if(man[i]>alive){
                System.out.printf("初始编号：%d，约瑟夫编号：%d\n",i+1,man[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int alive;
        //输入想活下来的人数alive
        Scanner input=new Scanner(System.in);
        System.out.println("输入想要存活下来的人数：");
        alive=input.nextInt();
        Josephus(alive);


    }
}
