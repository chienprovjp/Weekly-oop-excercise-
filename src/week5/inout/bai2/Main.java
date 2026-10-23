package week5.inout.bai2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn (source): ");
        String sourcePath = scanner.nextLine().trim();

        System.out.print("Nhập đường dẫn tệp đích (destination): ");
        String destPath = scanner.nextLine().trim();

        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            try {
                reader = new BufferedReader(new FileReader(sourcePath));
            } catch (FileNotFoundException e) {
                System.out.println("Source file not found.");
                return;
            }

            try {
                writer = new PrintWriter(new FileWriter(destPath));
            } catch (FileNotFoundException e) {
                System.out.println("Cannot create destination file.");
                return;
            }

            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                lineCount++;
            }

            System.out.println("Sao chép thành công " + lineCount + " dòng.");

        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (writer != null) {
                writer.close();
            }
            scanner.close();
        }
    }
}