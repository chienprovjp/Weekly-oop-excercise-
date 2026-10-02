package week2.bai1_7;

import java.util.Scanner;

public class Solution {

    public int reverse(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("\n--- Nhap tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("Ket qua dao nguoc: " + solution.reverse(n));
        } else {
            System.out.println("Du lieu nhap vao khong phai so nguyen hop le!");
        }

        scanner.close();
    }
}