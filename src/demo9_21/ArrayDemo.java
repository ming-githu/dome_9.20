package demo9_21;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr);
    }
}
