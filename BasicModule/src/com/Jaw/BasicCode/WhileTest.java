package com.Jaw.BasicCode;

public class WhileTest {
    /*
        while循环：
            1、while循环语句机制以及执行原理
                语法机制：
                    while(布尔表达式){
                        循环体；
                    }
                执行原理：
                    a.判断布尔表达式的值，若为true则执行循环体；
                    b.循环体执行结束后，再次判断布尔表达式的值，若为true则继续执行循环体；
                    C.直到布尔表达式为false时，while循环结束。
            2、while循环的循环次数0~n
     */

    public static void main(String[] args) {

        func1();

    }

    public static void func1(){
        int i = 1;
        while (i < 10){
            System.out.println("i---->" + i);
            i++;
        }

    }
}

