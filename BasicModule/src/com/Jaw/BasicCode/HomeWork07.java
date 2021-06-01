package com.Jaw.BasicCode;

public class HomeWork07 {
    /*
        一个数如果恰好等于它的因子数之和，这个数就是完数，例如：6 = 1 + 2 + 3，请找出1000内所有的完数
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 1000 ; i++) {
            int sum = 0;
            for (int j = 1; j <= i/2 ; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
