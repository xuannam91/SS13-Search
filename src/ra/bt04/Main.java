package ra.bt04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 47, 10, 6, 4, 9, 5};
        int index = -1;

        System.out.println("Nhập vào số cần tìm kiếm:");
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                index = i;
            }
        }

        if(index != -1) {
            System.out.println("Vị trí của số " + number + " trong mảng là: " + index);
        } else {
            System.out.println("Số " + number + " không tồn tại trong mảng!");
        }
    }
}
