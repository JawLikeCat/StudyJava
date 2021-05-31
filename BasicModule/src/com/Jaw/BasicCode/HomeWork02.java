package com.Jaw.BasicCode;

public class HomeWork02 {
    /*
        计算1+2-3+4-5+6-7.....+100的结果
     */

    public static void main(String[] args) {

        int sum = 1;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
//                System.out.println(i);
            }else {
                sum -= i;
//                System.out.println(i);
            }

        }
        System.out.println(sum);
    }
}
