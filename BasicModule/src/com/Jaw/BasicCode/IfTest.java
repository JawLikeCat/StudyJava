package com.Jaw.BasicCode;
import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {

        func1();
        func2();
        func3();
        func4();
    }

    public static void func1(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入您的年龄:");
        int age = userInput.nextInt();

        if (age < 0 || age > 100 ){
            System.out.println("您输入的年龄异常");
        }else if(age <=5){
            System.out.println("您的处于婴幼儿阶段,好好吃饭才能长个哦");
        }else if (age <= 18){
            System.out.println("您处于青少年阶段，好好学习少");
        }else if (age <= 35){
            System.out.println("您处于青年阶段，努力工作出人头地");
        }else if (age <= 55){
            System.out.println("您处于中年阶段，注意多多练");
        }else {
            System.out.println("您处于老年阶段，注意身体健康");
        }
    }

    public static void func2(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入您的年龄:");
        int age = userInput.nextInt();
        String str = "老年人";

        if (age < 0 || age > 100){
            System.out.println("您输入的年龄异常");
            return;
        } else if (age <= 5){
            str = "婴幼儿";
        } else if (age <= 18){
            str = "青少年";
        } else if (age <= 35){
            str = "青年";
        } else if (age <= 55){
            str = "中年";
        }
            System.out.println(str);

    }

    public static void func3(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入你的成绩:");
        int scores = userInput.nextInt();
        String rank = "不及格";

        if (0 > scores || scores > 100){
            System.out.println("输入成绩异常");
            return;
        } else if (scores >= 90 ){
            rank = "优秀";
        } else if (scores >= 80){
            rank = "良好";
        } else if (scores >= 70){
            rank = "中";
        } else if (scores >= 60){
            rank = "及格";
        }
            System.out.println(rank);
    }

    public static void func4(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("请输入天气状况,1代表雨天,0代表晴天:");
        int weather = userInput.nextInt();
        System.out.print("您是男孩还是女孩,1代表男孩,0代表女孩:");
        int sex = userInput.nextInt();

        if ((weather != 0 && weather != 1) || (sex != 0 && sex != 1) ){
            System.out.println("输入不合法");
        }else if (weather == 1){
                if (sex == 1){
                    System.out.println("打一把大黑伞");
                }else {
                    System.out.println("打一把小花伞");
            }
        }else {
            if (sex == 1){
                System.out.println("出去玩耍");
            }else {
                System.out.println("涂点防晒霜出去玩耍");
            }
        }

    }

}
