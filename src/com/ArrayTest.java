package com;

/**
 * Creat by lf on 2022/4/29 19:13
 * 一维数组的使用
 * 1.一维数组的声明和初始化
 * 2.如何调用数组的指定位置的元素
 * 3.如何获取数组的长度
 * 4.如何遍历数组
 * 5.数组元素的默认初始化值  //数组元素的基本数据类型的默认初始化值为0
 *                                     引用数据类型的默认初始化值为null
 * 6.数组的内存解析
 */
public class ArrayTest {
               public static void main(String[] args){
                   //静态初始化：数组的初始化和数组元素的赋值操作同时进行
                   int[] a=new int[]{1,2,3,4};
                   //动态初始化：数组的初始化和数组元素的操作分开进行
                   String[] name=new String[3];
                   //通过角标的方式调用数组元素的指定位置，
                   //数组的角标（索引）是从0开始，到数组的长度-1结束
                   name[0]="邱";
                   name[1]="龙";
                   name[2]="飞";
                   //获取数组长度  属性  length
                  // System.out.println(name.length);
                   //遍历数组
                   for (int i=0;i<name.length;i++){
                       System.out.print(name[i]);

                   }

               }
}
