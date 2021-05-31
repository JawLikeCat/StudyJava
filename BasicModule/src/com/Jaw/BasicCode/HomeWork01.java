package com.Jaw.BasicCode;

public class HomeWork01 {
    /*
        计算1000以内所有不能被7整除的整数之和
     */

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 1000 ; i++) {
            if (i % 7 == 0) {
//                System.out.println(i);
                continue;
            }
//            System.out.println(i);
            sum += i;
        }
        System.out.println("1000以内所有不能被7整除的整数之和为：" + sum);
    }


}
