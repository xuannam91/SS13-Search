package ra.bt03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần tìm kiếm:");
        int number = sc.nextInt();

        System.out.println(search(number));
    }

    private static boolean search(int number) {
        boolean check = false;
        int[][] arr = getArr();
        StringBuffer printIndex = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == number) {
                    String str = i + "." + j + ", ";
                    printIndex.append(str);
                    check = true;
                }
            }
        }

        for (int[] e : arr) {
            System.out.println(Arrays.toString(e));
        }

        System.out.println();
        if (check) {
            System.out.println("\u001B[33mVị trí xuất hiện của số " + number + " là:");
            System.out.println(printIndex);

        } else {
            System.out.println("\u001B[33mSố " + number + " không tồn tại trong mảng");
        }
        System.out.println();

        return check;
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
}
