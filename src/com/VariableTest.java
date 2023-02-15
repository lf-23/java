package com;

public class VariableTest {
    public static void main (String[] args){
        int myNumber=1000;
        short myId=1234;
        long myMoney=2939774L;
        float myWeight= 75.5F;
        double myWidth=12.5;//通常使用double型
        System.out.println(myNumber);
        System.out.println(myId);
        System.out.println(myMoney);
        System.out.println(myWeight);
        System.out.println(myWidth);
        char c1='2';
        System.out.println(c1);
        char c2='\n';//转义字符 \n换行符 \t制表符
        char c3='\t';
        System.out.println("hello"+c2+"lf");
        System.out.println("hello"+c3+"lf");
        boolean isMarry=false;
        if(isMarry){
            System.out.println("可以参加party");
        }
        else{
            System.out.println("\"不可以\"参加party");
        }
    }
      /*public  void method (){
         int myClass=21;
        System.out.println(myClass);
    }*/
}

