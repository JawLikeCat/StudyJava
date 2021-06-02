package com.Jaw.MethodCode;

public class MethodTest02 {

    public static void main(String[] args) {

        func1();
        func2();
    }

    public static void func1() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i----->" + i);
        }
        System.out.println("func1");
    }

    public static void func2() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("i----->" + i);
        }
        System.out.println("func2");
    }
}
