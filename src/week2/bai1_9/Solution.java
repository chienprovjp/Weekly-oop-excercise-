package week2.bai1_9;

import java.util.Scanner;

public class Solution {

    public int sumOfDigits(int n) {
        long temp = n;
        if (temp < 0) {
            temp = -temp;
        }

        int sum = 0;
        while (temp > 0) {
            sum += (int) (temp % 10);
            temp /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("\n--- Nhap tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("Tong cac chu so cua " + n + " la: " + solution.sumOfDigits(n));
        } else {
            System.out.println("Du lieu nhap vao khong phai so nguyen hop le!");
        }

        scanner.close();
    }
}
