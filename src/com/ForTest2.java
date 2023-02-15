package com;

/**
 * Creat by lf on 2022/4/22 19:08
 *
 *
 * 技巧：外层循环控制行数，内层循环控制列数
 */
public class ForTest2 {
    public static void main (String [] args){
        for (int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
