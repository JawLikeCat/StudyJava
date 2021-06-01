package com.Jaw.BasicCode;

public class HomeWork06 {

    /*
        小芳的妈妈每天给她2.5元，她都会存起来，但是每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元，请问经过
        多少天小芳才可以存到100元钱
     */
    public static void main(String[] args) {

        double deposit = 0;
        int days = 0;
        do {
            deposit += 2.5;
            days += 1;
            if (days % 5 == 0) {
                deposit -= 6;
            }
//            System.out.println(deposit);
        }while (deposit <= 100);
        System.out.println("小芳需要" + days + "天才能存够" + deposit + "元钱");
    }


}
