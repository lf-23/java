package com;

/**
 * Creat by lf on 2022/4/27 15:58
 */
public class PrimeNumberTest1 {
    public static void main(String [] args){
        long start=System.currentTimeMillis();
        boolean isFlag=true;//标识i是否被j除尽，一旦除尽，修改其值
        for (int i=2;i<=100000;i++){//遍历10000以内的自然数
            for (int j=2;j<=Math.sqrt(i);j++){//j:被i去除  //优化二
                if(i%j==0){//i被j除尽
                    isFlag=false;
                    break;//优化一：只对非质数的自然数有效（遇到第一个整除的直接结束循环）
                }
            }
            if(isFlag == true) {
                System.out.println(i);
            }
            isFlag=true;//重置flag

        }
        long end=System.currentTimeMillis();
        System.out.println("所用的时间"+(end-start));

    }
}

