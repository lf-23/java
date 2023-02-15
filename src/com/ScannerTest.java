package com;

/**
 * Creat by lf on 2022/4/20 13:31
 * 如何从键盘获取不同的变量：需要使用scanner类
 * 步骤：1.导包： import java.util.Scanner;
 *      2. Scanner的实例化：Scanner scan = new Scanner(System.in);
 *      3.调用Scanner类的相关方法，来获取指定类型的变量。
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=scan.next();
        System.out.println(name);
        System.out.println("请输入年龄：");
        int age=scan.nextInt();
        System.out.println("请输入生日：");
        int number=scan.nextInt();
        System.out.println("请输入星座：");
        String xingzuo=scan.next();
    }
}
