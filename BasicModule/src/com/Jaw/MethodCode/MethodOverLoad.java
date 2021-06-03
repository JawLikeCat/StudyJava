package com.Jaw.MethodCode;

public class MethodOverLoad {
    /*
        方法重载：
            什么时候需要考虑使用方法重载？
                在同一个类中，如果"功能1"和"功能2"他们的功能很相似，那么可以考虑将他们的方法名一致，这样便于后期代码编写。
            什么时候会发生方法重载？
                条件1：在同一个类中；
                条件2：方法名相同；
                条件3：参数列表不同；
                    a.参数的个数不同算不同
                    b.参数的类型不同算不同
                    c.参数的顺序不同算不同
                方法的重载和方法的返回值类型无关。
     */
    public static void main(String[] args) {
        m1();
        m1(100);
        m2(10);
        m2(10.000);
        m3(10, 100L);
        m3(100L, 10);
    }

    public static void m1() {
        System.out.println("无参数m方法执行");
    }

    public static void m1(int i) {
        System.out.println("有参数"+ i +"m方法执行");
    }

    public static void m2(int x) {
        System.out.print("m2 int ");
        System.out.println(x);
    }

    public static void m2(double x) {
        System.out.print("m2 double ");
        System.out.println(x);
    }

    public static void m3(int x, long y) {
        System.out.print("m3 int long ");
        System.out.println(x);
        System.out.println(y);
    }

    public static void m3(long x, int y) {
        System.out.print("m3 long int ");
        System.out.println(x);
        System.out.println(y);
    }

}
