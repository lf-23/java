package com;

import javax.naming.Name;

/**
 * Creat by lf on 2022/4/30 14:04
 * 二维数组的使用
 *  * 1.二维数组的声明和初始化
 *  * 2.如何调用数组的指定位置的元素
 *  * 3.如何获取数组的长度
 *  * 4.如何遍历数组
 *  * 5.数组元素的默认初始化值
 *  * 6.数组的内存解析
 */
public class ArrayTest2 {
    public static void main(String[] args){
        int  a[][]=new int[][]{{1,2,3},{4,5,6},{7,8}};//静态初始化
        String name[][]=new String [3][3];//动态初始化
       //String name1[][]=new String[3][];//动态初始化
        System.out.println(a[1][0]);//调用静态初始化数组元素
        System.out.println(name[1][2]);//调用动态数组元素
       // name1 [2]=new String[4];//调用动态初始化数组元素
      // System.out.println(name1[2][0]);
        System.out.println(a.length);
        System.out.println(a[2].length);//获取数组长度
        System.out.println(name.length);
        //遍历数组元素
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
