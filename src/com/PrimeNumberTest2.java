package com;

/**
 * Creat by lf on 2022/4/27 16:40
 */
public class PrimeNumberTest2 {
    public static void main(String [] args){
        long start=System.currentTimeMillis();
        lable: for (int i=2;i<=100000;i++){//遍历10000以内的自然数
            for (int j=2;j<=Math.sqrt(i);j++){//j:被i去除  //优化二
                if(i%j==0){//i被j除尽
                    continue lable;//标签的使用（结束本次循环，循环下一个）
                }
            }
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("所用的时间"+(end-start));

    }
}
