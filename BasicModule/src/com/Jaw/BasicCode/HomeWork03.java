package com.Jaw.BasicCode;
import java.util.Scanner;

public class HomeWork03 {
    /*
        从控制台输入一个正整数，计算改数的阶乘.eg:输入5，阶乘为5*4*3*2*1
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入一个正整数:");
        int num = userInput.nextInt();
        int result = 1;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
        }
        System.out.println(num + "的阶乘为:" + result);
    }
}
