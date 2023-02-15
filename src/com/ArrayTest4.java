package com;

/**
 * Creat by lf on 2022/4/30 17:27
 */
public class ArrayTest4 {
    public static void main(String[] args){
        int[][] YH=new int [10][];
        for(int i=0;i<YH.length;i++){
            YH[i]=new int[i+1];//给数组元素赋值操作
            YH[i][0]=YH[i][i]=1;//给首末元素进行赋值
            if(i>=2){
                for(int j=1;j< YH[i].length-1;j++){//给非首末元素赋值
                    YH[i][j]= YH[i-1][j-1]+ YH[i-1][j];
                }

            }
        }
        for (int i=0;i<YH.length;i++){//遍历数组
           for(int j=0;j< YH[i].length;j++){
               System.out.print(YH[i][j]+"   ");
           }
            System.out.println();
        }

    }
}


