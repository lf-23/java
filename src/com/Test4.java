package com;
/**
 * Creat by lf on 2022/4/20 14:12
 * 岳小鹏参力加Java考试， 他和父亲岳不群达成承诺:
 * 如果:
 * 成绩为100分时，奖励一辆BMW;
 * 成绩为(80，99]时，奖励一台iphone xs max;
 *当成绩为[60, 80]时，奖励一个iPad;
 *其它时，什么奖励也没有。
 *请从键盘输入岳小鹏的期末成绩，并加以判断
 */
import java.util.Scanner;
public class Test4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score=scan.nextInt();
        if( score==100){
            System.out.println("奖励女友一枚");
        }
        else if(score<=90&&score>80){
            System.out.println("奖励iphone");
        }
        else if(score<=80&&score>60){
            System.out.println("奖励ipad");
        }
        else{
            System.out.println("奖励一巴掌");
        }

    }
}
