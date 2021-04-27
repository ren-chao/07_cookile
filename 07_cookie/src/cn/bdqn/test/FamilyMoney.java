package cn.bdqn.test;

import java.util.Scanner;

/**
 * @author chao
 * @create 2021-02-09 10:37
 */
public class FamilyMoney {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String  num=null;
        int inser=0;
        int jian=0;
        int countmoney=0;
        int countmoney1=0;
        String shou=null;
        String zhi=null;
        System.out.println("  -----------------家庭收支记账软件-----------------");
        do {
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退 出");
            switch (input.nextInt()){
                case 1:
                    System.out.println("  -----------------当前收支明细记录-----------------");
                    System.out.println("收支 账户金额 收支金额 说 明");
                    System.out.println("收入"+countmoney+"\t"+inser+"\t"+shou);
                    System.out.println("支出"+countmoney1+"\t"+ jian+"\t"+zhi);
                    break;
                case 2:
                    System.out.println("请输入本次收入金额");
                    inser=input.nextInt();
                    countmoney+=inser;
                    System.out.println("请输入本次收入说明");
                    shou=input.next();
                    break;
                case 3:
                    System.out.println("请输入本次支出金额");
                    jian=input.nextInt();
                    countmoney1+=jian;
                    System.out.println("请输入本次支出说明");
                    zhi=input.next();
                    break;
                case 4:
                    System.out.println("感谢你的使用");
                    return;


            }
            System.out.println("是否继续，执行此部操作");
            num=input.next();
        }while (!num.equals("no"));


    }

}
