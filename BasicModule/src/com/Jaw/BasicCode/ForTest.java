package com.Jaw.BasicCode;

public class ForTest {
        /*
            1、for循环的语法机制及运行原理
               语法机制：
                    for（初始表达式; 条件表达式; 更新表达式）{
                        循环体；java语句构成
                        java语句；
                        java语句；
                        java语句；
                        .....
                    }
               注意：
                    第一：初始化表达式最先执行，并且在整个循环中执行一次。
                    第二：条件表达式结果必须是一个布尔类型，也就是：true/false
              2、执行原理：
                    a.先执行初始化表达式，并且初始化表达式只执行一次；
                    b.然后判断条件表达式，若条件表达式结果为true，则执行循环体；
                    c.循环体执行完后，执行更新表达式
                    d.更新表达式执行完后，在判断条件表达式，如果还是true则继续执行循环体;
                    e.直到更新表达式执行完后，判断表达式结果为false，for循环结束。
              3、更新表达式可以控制循环次数，缺失更新表达式会导致死循环
         */

    public static void main(String[] args) {



        func1();
        func2();
        func3();
        func4();
        func5();

        }

    public static void func1(){
        /*
            简单for循环测试,输出20次
         */

        for (int i = 1; i <= 20; i++) {
            System.out.println("this for loop" + i);
    }

    }

    public static void func2(){

        int i = 1;
        for (; i <=10; i++) {
            System.out.println("inner i = " + i);
        }
        System.out.println("outer i = " + i);
    }

    public static void func3(){

        int sum = 0;
        for (int i = 1; i <= 100 ; i+=2) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void func4(){
        /*
            for循环嵌套
         */

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("j-------->" + j);

            }

        }

    }

    public static void func5(){
        /*
            输出九九乘法表
         */
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i*j) + "\t");
            }
            System.out.println();

        }


    }
}
