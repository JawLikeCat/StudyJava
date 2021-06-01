package com.Jaw.BasicCode;
import java.util.Scanner;

public class HomeWork05 {
    /*
        从键盘接收一个正整数，该正整数作为行数输出一下图形，eg:输入5
                *
               ***
              *****
             *******
            *********
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int num = userInput.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = (num - i); j > 0 ; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= ((i-1) * 2 + 1); j++) {
                    System.out.print("*");
                }
                for (int j = (num - i); j > 0 ; j--) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
