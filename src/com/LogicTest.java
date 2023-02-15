package com;

public class LogicTest  {
    public static void main (String [] args) {
        boolean b1 = true;
        int num1 = 10;
        if (b1 && (num1++ > 6)) {//当符号左边是true时，&&那么就会执行符号右边的运算
            System.out.println("You are dog!");
        } else {
            System.out.println("You are pig!");
        }
        System.out.println("num1=" + num1);
        boolean b2=false;
        int num2=10;
        if(b2 && (num2++>0) ){//当符号左边是false时，&&不在执行右边的运算
                   System.out.println("You are dog!");
        }
        else{
            System.out.println("You are pig!");
        }
        System.out.println("num2="+num2);
    }
    }


