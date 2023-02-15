package com;

public class StringTest {
    public static void main (String[] args){
        String Num="学号：";
        int number=2018;
        boolean b=true;
        String s=Num + number + b;//+ 是连接符号
        System.out.println(s);
        char c='a';
        int num=18;
        String str="why";
        System.out.println(c+num+str);
        System.out.println(str+num+c);
        System.out.println(num+str+c);//判断是否是连接符还是运算符
        System.out.println(c+(num+str));
        System.out.println((str+c)+num);

        //********
        System.out.println('*'+"\t"+'*');
        System.out.println('*'+'\t'+'*');//''单引号做运算  ""双引号做连接
        String s1="123";
        System.out.println(s1);

    }
}
