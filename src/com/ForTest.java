package com;

import com.sun.xml.internal.ws.wsdl.writer.document.Import;

/**
 * Creat by lf on 2022/4/21 15:46
 * 13.   for循环结构的使用：循环结构的四个要素
 * 					1.初始化条件  2.循环条件  3.循环体  4迭代条件
 * 					for循环的结构：for（1；2；4）{
 * 								3；}
 *                执行过程：1->2->3->4->2->3->4>>>2
 *
 *  例题：编写程序从1循环到150，并在每行打印一个值，
 *  另外在每个3的倍数行上打印出“foo”，
 * 在每个5的倍数行.上打印“biz”,
 * 在每个7的倍数行上打印输出“baz”。
 */
import java.util.Scanner;
public class ForTest {
   /* public static void main(String [] args){
        int i=0;
        for(i=0;i<=100000;i++){
            System.out.println("good！");
        }*/
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入数字：");
       int num=scan.nextInt();
       for( int i=0;i<=150;i++){
           System.out.println(i+"");
           if (num%3==0){
               System.out.print("foo"+" ");
           }
           if(num%5==0){
               System.out.print("biz"+" ");
           }
           if(num%7==0){
               System.out.print("baz"+" ");
           }else {
               System.out.println("");
           }

       }

   }

}
