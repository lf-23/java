package com;

/**
 * Creat by lf on 2022/4/20 12:31
 * 声明2个double型变量并且赋值，判断第一个数大于10.0，且第二个数小于20.0，
 * 打印两数之和。否则打印两数乘积
 */
public class Test3 {
    public static void main(String [] args){
        double b1=18.3;
        double b2=187.6;
        if(b1>10.0 && b2<20.0){
            System.out.println("b1+b2="+(b1+b2));
        }
        else{
            System.out.println("b1*b2="+(b1*b2));
        }

    }
}
