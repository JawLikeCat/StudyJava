package com.Jaw.MethodCode;

public class MethodHomeWork01 {
    /*
        写一个方法，输出大于一个正整数n的最小质数
     */
    public static void main(String[] args) {

        findPrimeNumber2(62);
        findPrimeNumber3(62);
    }


    public static void findPrimeNumber2(int n) {

        while (true) {
            n++;
            if (isPrimeNumber(n)) {
                System.out.println(n);
                break;
            }
        }
    }

    public static void findPrimeNumber3(int n) {

        while (!isPrimeNumber(++n)) {
        }
        System.out.println(n);
    }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
