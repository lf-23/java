package com;

/**
 * Creat by lf on 2022/4/30 15:25
 * 二维数组分为外层数组元素和内层数组元素
 *  int[][] arr=new int [3][5];
 *  外层元素arr[0]、arr[1]、arr[2]
 *  内层元素arr[0][0]、arr[0][4]、arr[1][4]等等
 */
public class ArrayTest3 {
    public static void main(String [] args){
        int[][] arr=new int [3][5];
        System.out.println(arr[1]);//获取数组元素的默认初始化
        System.out.println(arr[1][2]);
        System.out.println(arr);
        int[][] arr1=new int [3][];
       System.out.println(arr1[1]);
       // System.out.println(arr1[1][2]);编译不通过
    }
}
