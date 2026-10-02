package week2.bai1_5;

import java.util.Scanner;

public class Solution {

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("\n--- Nhap tu ban phim ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        System.out.println("UCLN cua " + a + " va " + b + " la: " + solution.gcd(a, b));
        scanner.close();
    }
}