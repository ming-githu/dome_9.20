package demo9_21;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5, 6};
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num;
                if (arr[j] > arr[i]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }
            }
            System.out.print(arr[i] + ",");
        }
    }
}
