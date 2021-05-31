package com.Jaw.BasicCode;

public class BreakTest {
    /*
        break语句：
            1、break语可以用在两个地方
                第一个位置：switch语句中，防止case穿透现象，终止switch语句；
                第二个位置：用在循环语句（for、while、do....while）中，终止循环的执行。
            2、break语句不是终止整个方法，是终止离自己最近的一层循环
     */

    public static void main(String[] args) {

        System.out.println("=======func1======");
        func1();
        System.out.println("=======func2======");
        func2();
        System.out.println("=======func3======");
        func3();
        System.out.println("=======func4======");
        func4();
        System.out.println("=======func5======");
        func5();

    }

    public static void func1() {

        for (int i = 1; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println("i---->" + i);
        }
        System.out.println("func1 not break");
    }

    public static void func2() {

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println("j------->" + j);
            }
            System.out.println("i----->" + i);
        }
    }

    public static void func3() {
        /*
            break跳出指定循环
         */

        a:for (int i = 1; i < 3; i++) {
            b:for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break a;
                }
                System.out.println("j---->" + j);
            }
        }
    }

    public static void func4() {

        int i = 1;
        while (i < 10) {

            if (i == 5) {
                break;
            }
            System.out.println("i---->" + i);
            i ++;
        }
    }

    public static void func5() {

        int i = 1;
        do {
            if (i == 6) {
                break;
            }
            System.out.println("i-----" + i);
            i++;
        }while (i < 10);
    }

}
