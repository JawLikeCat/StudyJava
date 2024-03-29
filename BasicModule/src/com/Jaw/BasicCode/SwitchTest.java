package com.Jaw.BasicCode;
import java.util.Scanner;


public class SwitchTest {
    /*
    switch语句：
        1、switch语句也是选择语句，也可以叫分支语句
        2、switch语句格式：

            switch (值) {
                case 值1:
                    java语句；
                    java语句；
                    break;
                case 值2:
                    java语句；
                    java语句；
                    break;
                case 值3：
                    java语句；
                    java语句；
                    break；
                default：
                    java语句

        }
       3、以上是一个完整的switch语句：
            break不是必须存在，default分支也不是必须的。
       4、switch语句支持的值有哪些：
            支持int类型以及String类型。
       5、switch语句中"值"与"值1" "值2"比较通过 "=="比较。
       6、switch执行原理：
            a、拿"值"与"值1"比较，如果相同则执行该分支java语句，然后遇到break语句，switch语句就结束了；
            b、如果"值"与"值1"不相同，则继续"值"与"值2"比较，如果相同则执行该分支java语句，然后遇到break语句，switch语句就结束了；
            c、如果分支执行了，但是该分支中没有break语句，则会发生case穿透现象；
            d、所有的case值都没有匹配，则会执行default分支java代码。

     */

    public static void main(String[] args) {

        func1();
        func2();
        func3();
        func4();
        func5();

    }

    public static void func1(){

        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();

        switch (num){
            case 1:
                System.out.println("case 1");
                System.out.println("this is case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
        }

    }

    public static void func2(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("please input a num:");
        int num = userInput.nextInt();


        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }

    }

    public static void func3(){

        /*
            case穿透
         */

        Scanner userInput = new Scanner(System.in);
        System.out.print("please input a num:");
        int num = userInput.nextInt();


        switch (num){
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }

    }

    public static void func4(){

        /*
            case合并
         */

        Scanner userInput = new Scanner(System.in);
        System.out.print("please input a num:");
        int num = userInput.nextInt();


        switch (num){
            case 1: case 2: case 3:
                System.out.println("星期一");
                System.out.println("星期二");
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }

    }

    public static void func5(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入你的成绩:");
        double scores = userInput.nextDouble();

        if (scores < 0 || scores > 100){
            System.out.println("输入异常");
            return;
        }
        int grade = (int)(scores / 10);
        String str = "不及格";

        switch (grade){

            case 10: case 9:
                str = "优";
                break;
            case 8:
                str = "良";
                break;
            case 7:
                str = "中";
                break;
            case 6:
                str = "及格";
                break;
        }
        System.out.println(str);

    }
}
