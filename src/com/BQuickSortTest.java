package com;

/**
 * Creat by lf on 2022/5/5 17:11
 */
public class BQuickSortTest {//快速排序
    public static void quicksort (int[] arr,int low,int high){
        int i,j,pivot,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        pivot=arr[low];
        while(i<j){
            while(arr[j]>=pivot&&i<j){
                j--;
            }
            while(arr[i]<=pivot&&i<j){
                i++;
            }
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low] = arr[i];
        arr[i] = pivot;
        //递归调用左半数组
        quicksort(arr, low, j-1);
        //递归调用右半数组
        quicksort(arr, j+1, high);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{54,23,-13,6,32,-54,65,-76,100,-234};
        quicksort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
