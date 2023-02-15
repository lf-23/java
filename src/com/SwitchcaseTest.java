package com;

/**
 * Creat by lf on 2022/4/21 13:54
 * 根据Switch表达式中的值，依次匹配各个case中的常量。
 * 一旦匹配成功，则进入相应的case结构中，调用其执行语句。
 * 当调用完执行语句后，则仍然继续向下执行其他case结构中的执行语句，
 * 直到遇到break或者Switch-case结构末尾结束。
 * 1.Switch结构中的表达式，只能是如下8种类型之一：byte、short、char、
 * int、枚举类型、String类型
 *2.如果Switch-case中的多个case执行语句相同，则可以考虑进行合并。
 *
 * 例题：使用Switch把小写类型的char型转换为大写。只转换a,b,c,d,e,其他输出other
 */
import java.util.Scanner;
 public class SwitchcaseTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字母：");
        String word =scan.next();
        char c =word.charAt(0);
        switch(c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
            System.out.println("B");
            break;
            case 'c':
            System.out.println("C");
            break;
            case 'd':
            System.out.println("D");
            break;
            default:{
                System.out.println("other");
            }

        }

    }
    /*public static void main(String[] args) {
    int number=5;
    switch (number){
        case 0:
            System.out.println("0");
            break;
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("无");
    }

    }*/
}