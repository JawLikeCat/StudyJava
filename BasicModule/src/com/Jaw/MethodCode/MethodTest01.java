package com.Jaw.MethodCode;


public class MethodTest01 {
    /*
        1、方法怎么定义，语法机制是？
            [修饰符列表]   返回值类型   方法名（形式参数列表）{
                方法体;
            }
            注意：[]符号中的内容标识不是必须的，是可选的
            1.1、关于修饰符列表：
                修饰符列表不是必选项，是可选项，目前固定写为 public static
            1.2、关于返回值类型：
                a.返回值类型可以是任意类型，byte、short、int、long、float、double、boolean、char、String
                b.返回值是一个方法执行结束之后的结果，通常是一个"值"，所以被称为"返回值"
                c.当一个方法不返回任何值的时候，返回值类型也不嫩空白，使用void关键字，void表示该方法执行结束后不返回任何值
                b.如果返回值类型不是void，则方法体执行结束后必须使用"return 值"这样的语句完成"值的返回"，若果没有"return 值"则编译报错
                e.只要有"return"关键字的语句的执行，当前方法必然结束
                f.如果返回值类型是void，那么方法体中不能有"return 值;"这样的语句，但是可以有"return;"语句用来终止当前方法
                g.除了void之外，剩下的必须有"return 值;"这样的语句
            1.3、方法名
                方法名见名知意（驼峰命名方式）
                方法名在标识符命名规范中，要求首字母小写，后面每个字母大写
            1.4、形式参数列表
                简称：形参
                注意：形式参数列表中的每一个参数都是"局部变量"，方法结束后内存释放。
                形参的个数是：0~n个
        2、方法的调用
            方法通过类名.方法名(实际参数列表)；
            实参和形参的类型必须一一对应，另外个数也要一一对应。
            a()方法在调用b()方法的时候，若a和b方法在同一个类中则可以省略类名

     */

    public static void main(String[] args) {

        System.out.println("main begin");
        func1();
        MethodTestSub.func1();
        func2();
        System.out.println("main over");
    }

    public static void  func1() {

        System.out.println("this is func1");
    }

    public static void func2() {

        System.out.println("this is func2");
        MethodTestSub.func1();                    //不止只有main()方法可以调用方法
    }
}

class MethodTestSub {

    public static void func1() {

        System.out.println("this is MethodTestSub.func1");
    }
}
