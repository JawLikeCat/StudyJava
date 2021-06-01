package com.Jaw.BasicCode;
import java.util.Scanner;

public class HomeWork04 {

    /*
        接受一个正整数，判断是否为质数
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入一个正整数:");
        int num = userInput.nextInt();
        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i < num ; i++) {
                if (num % i == 0 ) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + "是一个质数");
            }else {
                System.out.println(num + "不是质数");
            }
        }else if (num == 1) {
            System.out.println("1是一个质数");
        }
    }
}