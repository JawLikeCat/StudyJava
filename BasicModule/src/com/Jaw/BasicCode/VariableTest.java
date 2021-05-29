package com.Jaw.BasicCode;

public class VariableTest {

    int age = 20;  //这是成员变量

    /*
        1.在同一个域中变量名不能重复声明
        2.变量的分类，根据变量出现的位置划分：
            在方法体当中声明的变量：局部变量
            在方法体外类体内声明的变量：成员变量
        3.局部变量只在方法体中有效，方法体执行结束该变量的内存就释放了
        4.变量的作用域，除了大括号就无效了
    */
    public static void main(String[] args) {


        int age = 20;                   //这是局部变量
        System.out.println(age);

        //  int age = 20;
        // double age = 20.0;

        for (int i = 0; i < 10; i++) {

        }
        /* System.out.println(i); */


    }

    public static void test(){

        int age = 20;
    }
}
