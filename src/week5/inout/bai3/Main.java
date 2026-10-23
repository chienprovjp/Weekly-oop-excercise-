package week5.inout.bai3;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void writeData(String fileName, Scanner scanner) {
        System.out.print("\nNhập số lượng số nguyên cần ghi n: ");
        int n = scanner.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            System.out.println("Nhập " + n + " số nguyên:");
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                dos.writeInt(number);
            }
            System.out.println("-> Đã ghi dữ liệu thành công vào tệp " + fileName);
        } catch (IOException e) {
            System.out.println("I/O error khi ghi tệp: " + e.getMessage());
        }
    }

    public static void readData(String fileName) {
        System.out.println("\n--- Đọc dữ liệu từ tệp " + fileName + " ---");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.print("Các số đọc được: ");
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.print(number + " ");
                } catch (EOFException e) {

                    break;
                }
            }
            System.out.println("\n-> Đã đọc hết toàn bộ tệp.");
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp: " + fileName);
        } catch (IOException e) {
            System.out.println("I/O error khi đọc tệp: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên tệp nhị phân (ví dụ: numbers.dat): ");
        String fileName = scanner.nextLine().trim();

        writeData(fileName, scanner);

        readData(fileName);

        scanner.close();
    }
}