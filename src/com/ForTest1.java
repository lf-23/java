package com;

/**
 * Creat by lf on 2022/4/21 19:43
 *例题：2题目: 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如: 12和20的最大公约数是4， 最小公倍数是60。
 */
import java.util.Scanner;
public class ForTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int m=scan.nextInt();
        System.out.println("请输入第二个数：");
        int n=scan.nextInt();
        int min=(m<n)?m:n;//找出俩个中最小的数
        for (int i=min;i>=1;i--){//从最大的公因数到最小的公因数进行查找
            if(m%i==0 && n%i==0){
                System.out.println(i);
                break;
            }
        }
        int max=(m>n)?m:n;//找出俩个中最大的数
        for (int i1=max;i1<=m*n;i1++){
            if(i1%m==0 && i1%n==0){//从最大的数开始到俩数的乘积进行查找
                System.out.println(i1);
                break;
            }

        }

    }
}
