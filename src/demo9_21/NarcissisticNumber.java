package demo9_21;

public class NarcissisticNumber {
    public static void main(String[] args) {

        NarcissisticNumber n = new NarcissisticNumber();
        n.Numbers();

    }

    public void Numbers() {
        int ones, tens, hundre;
        for (int i = 0; i < 100; i++) {
            ones = i % 10;
            tens = i / 10 % 10;
            hundre = i / 10 / 10 % 10;
            if (ones * ones * ones + tens * tens * tens + hundre * hundre * hundre == i) {
                System.out.println(i);
            }
        }

    }
}
