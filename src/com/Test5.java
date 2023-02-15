package com;

import java.util.Scanner;

/**
 * Creat by lf on 2022/4/20 15:48
 * 由键盘输入三个整数分别存入变量num1 ，num2，num3 对他们进行排序，并且从小到大输出
 */
import java.util.Scanner;
public class Test5 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1>=num2){//先比较俩数的大小
            if (num3<=num2){//if else 语句的嵌套使用；再用第三个数与这俩数依次比较
                System.out.println(num3+","+num2+","+num1);
            } else if(num3>=num1){
                System.out.println(num2+","+num1+","+num3);
            } else{
                System.out.println(num2+","+num3+","+num1);
            }
        } else{//num1<num2
            if (num3>=num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            }
            else if(num3<num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            }
            else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }

    }
}
