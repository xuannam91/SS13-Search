package ra.bt02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int min = arr[0];

        for (int e: arr) {
            if(min > e) {
                min = e;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

}
