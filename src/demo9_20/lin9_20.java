package demo9_20;

//类型转换
public class lin9_20 {
    public static void main(String[] args) {
//        System.out.println("222");
//        自动转换
        double d = 10;
        System.out.println(d);//10.0
//        强制转换
//        把一个表示数据范围大的赋值给表示数据范围小的变量
        int i = (int) 8.88;
        System.out.println(i);//8会发生数据丢失，不建议使用
    }
}
