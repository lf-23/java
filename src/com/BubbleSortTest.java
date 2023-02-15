package com;

/**
 * Creat by lf on 2022/5/5 16:36
 */
public class BubbleSortTest {//冒泡排序
    public static void main(String[] args) {
        int[] arr=new int[]{54,23,-13,6,32,-54,65,-76,100,-234};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
