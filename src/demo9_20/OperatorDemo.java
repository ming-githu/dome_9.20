package demo9_20;

public class OperatorDemo {
    public static void main(String[] args) {
//        逻辑运算符与：&,或：| , 非：！
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println(a == 1 & b == 1);//false
        System.out.println(b == 2 | c == 2);//ture
        System.out.println(!(a == 2));//ture
//        &&和&
        System.out.println(a++ > 10 & b++ > 20);//第一个不符合条件，后面的还会执行a=2 b=3
        System.out.println(c++ > 30 && d++ > 40);//第一个不符合条件，后面的不会执行 c=4 d=4
        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//4
        System.out.println(d);//4


    }
}
