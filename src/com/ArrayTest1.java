package com;

import java.util.Scanner;

/**
 * Creat by lf on 2022/4/29 20:54
 * 例题    * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10等级为'A'
 * 成绩>=最高分-20等级为’B'
 * 成绩>=最高分-30等级为' C ,
 * 其余等级为'D'
 * 提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class ArrayTest1 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number=scan.nextInt();//从键盘上读值
        int[] scores=new int[number];//创建动态数组;存储学生成绩；动态初始化
        System.out.println("请输入学生成绩：");
        for(int i=0;i<scores.length;i++){//遍历整个数组，
            scores[i]=scan.nextInt();//对键盘所输入的值进行赋值操作
        }
        int MaxScore=0;
        for (int i=0;i<scores.length;i++){
            if(scores[i]>MaxScore){
               MaxScore=scores[i];//遍历整个数组，获取数组最大值
            }
        }
       for(int i=0;i<scores.length;i++){
           if(scores[i]>=MaxScore-10){
               System.out.println(scores[i]+" 等级为A");
           }else if(scores[i]>=MaxScore-20){
               System.out.println(scores[i]+" 等级为B");
           }else if(scores[i]>=MaxScore-20){
               System.out.println(scores[i]+" 等级为C");
           }else {
               System.out.println("D");
           }

       }
    }
}
