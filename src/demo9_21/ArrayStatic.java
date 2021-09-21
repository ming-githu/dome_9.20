package demo9_21;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5, 6};
        ArrayStatic a = new ArrayStatic();
        arr = a.arrs(arr);//调用数组排序的方法
        System.out.println(arr);
//        使用static定义的方法不需要new出来一个对象就可以直接使用
        arrs2(arr);
    }

    //    定义数组排序的方法
    public int[] arrs(int[] arr) {
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
        return arr;
    }

    //    定义数组排序的方法 使用static定义的
    public static int[] arrs2(int[] arr) {
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
        return arr;
    }
}
