package com.Jaw.BasicCode;

import java.util.Scanner;

public class UserIput {
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        int i = s.nextInt();
        System.out.println("您输入的数字是" + i);

        System.out.print("您输入的姓名：");
        String str = s.next();
        System.out.println("您的姓名是：" + str);

        Scanner t = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        int x = t.nextInt();
        System.out.print("请输入第二个数字:");
        int y = t.nextInt();
        System.out.println(x + "+" + y + "=" + (x+y));
    }
}
