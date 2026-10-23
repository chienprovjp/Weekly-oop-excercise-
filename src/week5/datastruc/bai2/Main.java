package week5.datastruc.bai2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[" + id + " - " + name + "]";
    }
}

class Message {
    private String id;
    private String content;

    public Message(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}

class Ticket {
    private String id;
    private String content;
    private long timestamp;

    public Ticket(String id, String content) {
        this.id = id;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }
}

class CustomerQueue {
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println("-> Khách hàng " + c.getName() + " đã vào hàng đợi.");
    }

    public Customer processNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("Thông báo: Không còn khách đợi!");
            return null;
        }
        Customer c = queue.poll();
        System.out.println("\n=== Đang hỗ trợ: " + c + " ===");
        return c;
    }
}

class MessageHistory {
    private Stack<Message> history = new Stack<>();

    public void typeMessage(Message msg) {
        history.push(msg);
        System.out.println("Gõ: \"" + msg.getContent() + "\"");
    }

    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Không có tin nhắn nào để Undo.");
            return;
        }
        Message removed = history.pop();
        System.out.println("-> [Undo] Đã xóa câu: \"" + removed.getContent() + "\"");
    }

    public void viewLast() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử tin nhắn rỗng.");
            return;
        }
        System.out.println("-> [View Last] Câu gần nhất: \"" + history.peek().getContent() + "\"");
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();
        MessageHistory chat = new MessageHistory();

        customerQueue.addCustomer(new Customer("C01", "Khách A"));
        customerQueue.addCustomer(new Customer("C02", "Khách B"));

        customerQueue.processNextCustomer();
        chat.typeMessage(new Message("M1", "Chào bạn, Tiki có thể giúp gì ạ?"));
        chat.typeMessage(new Message("M2", "Đơn hàng của bạn đang được giao."));
        chat.typeMessage(new Message("M3", "Gõ nhầm câu này nè")); // câu gõ nhầm
        chat.undo();
        chat.viewLast();

        customerQueue.processNextCustomer();
        chat.typeMessage(new Message("M4", "Dạ chào khách B, bạn cần hỗ trợ gì ạ?"));

        customerQueue.processNextCustomer();
    }
}