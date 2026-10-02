package week2.bai1_8;

import java.util.Scanner;

public class Solution {

    public boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        if (n % 10 == 0 && n != 0) {
            return false;
        }

        int original = n;
        long reversed = 0;

        int temp = n;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("\n--- Nhap tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (solution.isPalindrome(n)) {
                System.out.println(n + " LA so Palindrome.");
            } else {
                System.out.println(n + " KHONG PHAI la so Palindrome.");
            }
        } else {
            System.out.println("Du lieu nhap vao khong phai so nguyen hop le!");
        }

        scanner.close();
    }
}
