package week2.bai1_6;

import java.util.Scanner;

public class Solution {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("\n--- Nhap tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (solution.isPrime(n)) {
                System.out.println(n + " la so nguyen to.");
            } else {
                System.out.println(n + " KHONG phai la so nguyen to.");
            }
        } else {
            System.out.println("Gia tri nhap vao khong phai so nguyen hop le!");
        }

        scanner.close();
    }
}