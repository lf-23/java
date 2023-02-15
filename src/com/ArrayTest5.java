package com;
/**
 * Creat by lf on 2022/4/30 19:13
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * *要求:所有随机数都是两位数。
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        int[] a = new int[10];//创建数组，动态初始化
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (99 - 10 + 1) + 10);//随机数
        }
        for (int i=0;i<a.length;i++){//遍历数组，输出数组
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        int Maxvalue = a[0];//输出最大值
        for (int i = 1; i < a.length; i++) {
            if (a[i] > Maxvalue) {
                Maxvalue = a[i];
            }
        }
        System.out.println("输出最大值：" + Maxvalue);
        int Minvalue = a[0];//输出最小值
        for (int i = 1; i < a.length; i++) {
            if (a[i] <Minvalue) {
                Minvalue = a[i];
            }
        }
        System.out.println("输出最小值：" + Minvalue);
        int count=0;//所有元素的总和
        for (int i=0;i<a.length;i++){
            count+=a[i];
        }
        System.out.println("所有元素的总和："+count);
        int Avgvalue=count/a.length;
        System.out.println("所有元素的平均值："+Avgvalue);

    }
}