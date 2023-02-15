package com; /**
 * Creat by lf on 2022/4/20 17:32
 * 假设你想开发一个玩彩票的游戏，程序随机地产生一一个两位数的彩票，
 * 提示用户输入-一个两位数， 然后按照下面的规则判定用户 是否能赢。
 * 1)如果用户输入的数匹配彩票的实际顺序，奖金10000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 */
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        //警惕警惕！！！！产生随机数的公式：(int)(Math.random()*(b-a+1)+a)
       int num = (int)(Math.random()*90+10);//随机数的产生  俩位数
        int a=num/10;//取十位数
        int b=num%10;//取个位数
        System.out.println("随机数:"+num);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入彩票号码：");
        int num1 = scan.nextInt();
        if(num1==num){
            System.out.println("奖金10000美元");
        }
        else if(a==num1%10 && b==num1/10){
            System.out.println("奖金3000美元");
        }
        else if(a==num1/10||b==num1%10){
            System.out.println("奖金1000美元");
        }else if(a==num1/10||b==num1/10||a==num1%10||b==num1%10){
            System.out.println("奖金500美元");
        }
        else{
            System.out.println("你无了！！！！！！");
        }
    }
}