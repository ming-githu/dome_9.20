package demo9_20;

import java.util.Scanner;

public class switchdemo {
    public void switch1(int week) {
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("请输入请输入1-7其中一个数字");
                Scanner sc = new Scanner(System.in);
                week = sc.nextInt();
                switch1(week);//使用递归
                break;
        }
    }

    public static void main(String[] args) {
//        键盘输入1-7 ，输出对应的星期一到星期日
        int week;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7其中一个数字");
        week = sc.nextInt();
        switchdemo sw = new switchdemo();
        sw.switch1(week);

    }
}
