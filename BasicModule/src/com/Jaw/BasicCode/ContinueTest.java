package com.Jaw.BasicCode;

public class ContinueTest {
    /*
        continue语句：
            1、continue语句作用是，结束本次循环，进入下一次循环继续执行；
                for (int i = 1; i < 10; i++) {
                    if (i == 5){
                        continue; 当此continue执行后，下面code1与code2不再执行，直接进入下一循环
                       }
                    code1;
                    code2;
                }
            2、continue也可以指定循环
     */


    public static void main(String[] args) {

        System.out.println("=====func1=====");
        func1();
        System.out.println("=====func2=====");
        func2();

    }

    public static void func1() {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("skip i = 5");
                continue;
            }
            System.out.println("i----->" + i);
        }
    }

    public static void func2() {

        a:for (int i = 0; i < 2; i++) {
            System.out.println("loop a executed " + i);
            b:for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    System.out.println("skip loop b 5-9");
                    continue a;
                }
                System.out.println("j------->" + j);
            }
        }
    }
}
