package com;

/**
 * Creat by lf on 2022/4/21 14:26
 * 例题：从键盘输入2022年的“month”和“day”,要求通过程序输出输入的日期为2022年的第几天
 */
import java.util.Scanner;
public class SwitchcaseTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2022年的月份：");
        int month=scan.nextInt();
        System.out.println("请输入2022年的日：");
        int day=scan.nextInt();
        int sumDays=0;
        switch (month){
            case 12:
                sumDays +=29;
            case 11:
                sumDays +=29;
            case 10:
                sumDays +=29;
            case 9:
                sumDays +=29;
            case 8:
                sumDays +=29;
            case 7:
                sumDays +=29;
            case 6:
                sumDays +=29;
            case 5:
                sumDays +=29;
            case 4:
                sumDays +=29;
            case 3:
                sumDays +=29;
            case 2:
                sumDays +=29;
            case 1:
                sumDays +=day;
        }
        System.out.println(sumDays);

    }
}
