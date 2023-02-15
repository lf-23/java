package com;

/**
 * Creat by lf on 2022/5/5 14:05
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        String[] arr = new String[]{"dd","jj","gg","mm"};//创建静态数组
        String[] arr1 =new String[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];//数组的复制操作
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //数组的反转
        for (int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-i-1];//数组下标从零开始
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }
}
