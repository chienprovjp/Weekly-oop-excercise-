package week5.datastruc.bai1;

public class Main {

    public static void useString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100_000; i++) {
            s += "Hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian dùng String (+): " + (end - start) + " ms");
    }

    public static void useStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100_000; i++) {
            sb.append("Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian dùng StringBuffer: " + (end - start) + " ms");
    }

    public static void contentAnalysis() {
        String text = "Java is powerful! Do you love Java? Yes, Java is everywhere. Let's learn it.";

        String[] sentences = text.split("[.!?]+");
        int sentenceCount = 0;
        for (String s : sentences) {
            if (!s.trim().isEmpty()) sentenceCount++;
        }
        System.out.println("\n--- Phân tích văn bản ---");
        System.out.println("Đoạn văn gốc: " + text);
        System.out.println("Số lượng câu: " + sentenceCount);

        String replacedText = text.replace("Java", "Python");
        System.out.println("Sau khi thay thế (Java -> Python): " + replacedText);
    }

    public static void main(String[] args) {
        System.out.println("--- So sánh hiệu năng nối chuỗi 100.000 lần ---");
        useStringBuffer();
        useString();
        contentAnalysis();
    }
}