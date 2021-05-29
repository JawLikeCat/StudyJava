package com.Jaw.BasicCode;

public class DateTypeTest {

    public static void main(String[] args) {
        CharTest();
    }

    /*


        byte     1      -128~127
        short    2      -32768~32767
        int      4      -2147483648~2147483647
        long     8      -9223372036854774808～9223372036854774807
        float    4      3.402823e+38～1.401298e-45
        double   8      1.797693e+308～4.9000000e-324
        boolean  1
        char     2      0~65535

        一.八种数据类型
            字符型：char
                1.char占用两个字节
                2.char取值范围0~65535
                3.char采用Unicode编码
                4.char的字面量使用单引号括起来
                5.char可以存储一个汉字

     */

    public static void CharTest() {

        char name = '王';
        System.out.println(name);
        char a = '0';
        System.out.println(a);
        char c = 'c';
        System.out.println(c);
        char num = 11;
        System.out.println(num);
    }



}
