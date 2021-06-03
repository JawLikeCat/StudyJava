package com.Jaw.MethodCode;

public class MethodHomeWork01 {
    /*
        写一个方法，输出大于一个正整数n的最小质数
     */
    public static void main(String[] args) {
        System.out.println(findPrimeNumber1(55));
        findPrimeNumber2(55);

    }

    public static int findPrimeNumber1(int n) {
        int i = 0;
        while (true) {
            int j = 1;
            i++;
            do {
                j++;
            } while ((n + i) % j != 0);
            if (j == (n+i)) {
                return n + i;
            }
        }
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

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
