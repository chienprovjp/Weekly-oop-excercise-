package week2.bai1_10;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean hasFirst = false;
        boolean hasSecond = false;

        for (int num : arr) {
            if (!hasFirst || num > first) {
                second = first;
                hasSecond = hasFirst;
                first = num;
                hasFirst = true;
            } else if (num < first) {
                if (!hasSecond || num > second) {
                    second = num;
                    hasSecond = true;
                }
            }
        }

        return hasSecond ? second : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("\n--- Nhap mang tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So luong phan tu phai lon hon 0.");
            } else {
                int[] arr = new int[n];
                System.out.println("Nhap " + n + " phan tu:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                int result = solution.secondLargest(arr);
                System.out.println("Mang vua nhap: " + Arrays.toString(arr));
                System.out.println("So lon thu hai la: " + result);
            }
        } else {
            System.out.println("Du lieu nhap vao khong hop le!");
        }

        scanner.close();
    }
}
