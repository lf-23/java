package com;

/**
 * Creat by lf on 2022/5/5 15:52
 */
public class ArrayTest8 {//折半查找  前提是数组要有序
    public static void main(String[] args) {
        boolean IsFlag=true;
        int[] arr=new int[]{-54,-23,-13,-6,32,54,65,76,100,234};
        int dest=54;
        dest=34;
        int low=0;
        int high=arr.length-1;
        int mid = 0;
        while(low<=high){
            mid=(low+high)/2;
            if(dest>arr[mid]){
                low=mid+1;
            }
            if(dest<arr[mid]){
                high=mid-1;
            }if(dest==arr[mid]){
                System.out.println("索引位置为："+mid);
                IsFlag=false;
                break;
            }
        }
        if(IsFlag){
            System.out.println("没找到");
        }

    }

}
