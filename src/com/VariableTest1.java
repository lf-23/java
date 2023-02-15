package com;

public class VariableTest1 {
    public static void main (String[] args){
        char c1='b';
        short s1=100;
        float c2=c1+s1;
        System.out.println(c2);
        double d1=1.0;
        int i1= (int) d1;//强制类型转换
        System.out.println(i1);
    }
}
