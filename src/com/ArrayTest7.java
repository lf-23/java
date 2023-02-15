package com;

/**
 * Creat by lf on 2022/5/5 15:09
 */
public class ArrayTest7 {//线性查找
    public static void main(String[] args) {
        String[] arr = new String[]{"dd","jj","gg","mm"};//创建静态数组
        String dest="jj";
        boolean IsFlag=true;
        for(int i=0;i<arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("找到指定元素的位置："+i);
                IsFlag=false;
                break;
            }
        }
        if(IsFlag){
            System.out.println("未找到，抱歉");
        }
    }
}
