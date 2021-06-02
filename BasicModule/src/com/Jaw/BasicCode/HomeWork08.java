package com.Jaw.BasicCode;
import java.util.Scanner;

public class HomeWork08 {
    /*
        给一个不多于5位的正整数
            1.求它是几位数
            2，逆序打印出各位数字
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("输入一个不多于5位的正整数:");
        int num = userInput.nextInt();
        int digit = 1;
        for (int i = 10; i > 1; i *= 10) {
            if (num / i > 0) {
                digit += 1;
            }
        }
        System.out.println(num+"是一个"+digit+"位数");
        int j = 10;
        System.out.print(num+"的逆序是：");
        for (int i = 0; i < digit ; i++) {
            System.out.print((num - (num / j * j)) / (j / 10));
            j *= 10;
        }
    }
}
