package com;
public class AriTest {
    public static void main(String [] args){
        int num1=21;
        int num2=6;
        System.out.println("num1%num2="+num1%num2);
        int num3=-21;//取余运算%   结果的符号与被模数的符号相同
        int num4=6;
        System.out.println("num3%num4="+num3%num4);
        int a1=10;
        int b1=a1++;//先取值后运算(自增1)
        System.out.println("a1="+a1+",b1="+b1);
        int a2=10;
        int b2=++a2;//先运算后取值
        System.out.println("a2="+a2+",b2="+b2);
    }
}
