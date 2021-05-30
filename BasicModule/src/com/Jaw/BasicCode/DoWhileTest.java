package com.Jaw.BasicCode;

public class DoWhileTest {
    /*
        do.....while语法机制及执行原理
            1、语法机制
                do{
                    循环体；
                }while(布尔表达式);
                注意：while后面不要漏掉分号";"

            2、执行原理：
                a.先执行一次循环体，执行一次循环后再判断布尔表达式，若为true则继续执行循环体；
                b.再次执行循环体后，判断布尔表达式，若为false则结束do....while循环
            3、对于do....while来说，循环次数1~n次
     */

    public static void main(String[] args) {
        func1();
        func2();

    }

    public static void func1(){
        int i = 0;
        do {
            System.out.println("i------->" + i);
            i ++;
        }while (i < 10);



    }

    public static void func2(){
        int i = 0;
        do {
            System.out.println("i------>" + ++i);
        }while (i < 10);
    }
}
