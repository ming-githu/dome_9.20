package demo9_21;

public class WhileDemo {
    public static void main(String[] args) {
        double paper = 0.1;
        double zf = 8844.43;
        int count = 0;
        while (paper <= zf) {
            paper *= 2;
            count++;
        }
        System.out.println(paper);
        System.out.println(count);
    }
}
