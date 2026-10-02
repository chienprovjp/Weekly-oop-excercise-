package week2.bai1_4;

import java.util.Scanner;

public class Solution {

    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long f0 = 0;
        long f1 = 1;
        long fn = 0;

        for (int i = 2; i <= n; i++) {
            if (f1 > Long.MAX_VALUE - f0) {
                return Long.MAX_VALUE;
            }
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            long result = sol.fibonacci(n);

            if (result == Long.MAX_VALUE) {
                System.out.println("F(" + n + ") = Long.MAX_VALUE (Vuot qua gioi han kieu long)");
            } else {
                System.out.println("F(" + n + ") = " + result);
            }
        } else {
            System.out.println("Du lieu nhap vao khong hop le!");
        }

        scanner.close();
    }
}