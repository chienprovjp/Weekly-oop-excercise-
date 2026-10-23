package week5.inout.bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Kết quả: " + a + " / " + b + " = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không phải là số nguyên!");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        } finally {

            System.out.println("Program finished.");
            scanner.close();
        }
    }
}