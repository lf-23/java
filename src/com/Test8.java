package com;

/**
 * Creat by lf on 2022/4/21 11:47
 * 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件:
 * 高: 180cm以上;富:财富1千万以上;帅:是。
 * 如果这三个条件同时满足，则:“我一定要嫁给他!!”
 * 如果三个条件有为真的情况，则:“嫁吧，比上不足，比下有余。”
 *如果三个条件都不满足，则:“不嫁!”
 */
import java.util.Scanner;
public class Test8 {
   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高：(cm)");
        int height = scan.nextInt();
        System.out.println("请输入财富：(千万)");
        double asset = scan.nextDouble();
        System.out.println("帅吗？");
        boolean faceScore = scan.nextBoolean();
        if(height>=180&&asset>=1&&faceScore==true){
            System.out.println("我一定要嫁给这个鳖孙！！！");
        }else if(height>=180 || asset>=1 || faceScore==true){
            System.out.println("嫁吧，凑合过吧，比上不足，比下有余！！！");
        }else {
            System.out.println("打死不嫁给穷逼丑比！！！");
        }
    }*/
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入身高：(cm)");
       int height = scan.nextInt();
       System.out.println("请输入财富：(千万)");
       double asset = scan.nextDouble();
       System.out.println("帅吗？(是/否)");
       String faceScore=scan.next();
       if(height>=180&&asset>=1 && faceScore.equals("s是")){
           System.out.println("我一定要嫁给这个鳖孙！！！");
       }else if(height>=180 || asset>=1 || faceScore.equals("s是")){
           System.out.println("嫁吧，凑合过吧，比上不足，比下有余！！！");
       }else {
           System.out.println("打死不嫁给穷逼丑比！！！");
       }
   }
}