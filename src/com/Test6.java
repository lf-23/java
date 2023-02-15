package com;
/**
 * Creat by lf on 2022/4/20 16:57
 * 我家的狗5岁了，5岁的狗相当于人类多大呢?其实，狗的前两年每一年相当于人类的10.5岁，
 * 之后每增加一年就增加四岁(第三年至以后 每一年相当于人类4岁)。那么5岁的狗相当于人类多少年龄呢?应该是: 10.5+ 10.5+4+4+4= 33岁。
 * 编写个程序， 获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
 * 如果用户输入负数，请显示一个提示信息。
 */
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入狗的年龄：");
        int dogAge=scan.nextInt();
        if(dogAge<=2){
            System.out.println("相当于人的年龄："+10.5*dogAge);
        }else  {
            System.out.println("相当于人的年龄："+((dogAge-2)*4+21));
        }
    }
}
