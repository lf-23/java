package com;
/**
 * Creat by lf on 2022/4/19 20:39
 *  * 三元运算符结构：  （条件表达式）？表达式1：表达式2
 *  * 条件表达式的结果为Boolean类型，根据表达式的结果真或假，决定执行表达式1，还是表达式2.
 *  * 如果表达式为true，则执行表达式1；
 *  * 如果表达式为false,则执行表达式2.
 *  * 注意:凡是可以用三元运算符的都可以使用if   else语句；反之不可以
 */
public class SanYuanTest {
    public static void main(String [] args){
        int m=78;
        int n=87;
        int max=(m>n)?m:n;
        System.out.println(max);
        //*******************获取三个数的最大值
        int a=-28;
        int b=73;
        int c=100;
        int max1=(a>b)?a:b;
        int max2=(max1>c)?max1:c;
        System.out.println("max2="+max2);
    }
}
