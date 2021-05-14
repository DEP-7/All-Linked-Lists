package ds;

public class CircularSinglyLinkedList {
    private Node head;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {
        if (index > size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            if (head == null) {
                head = new Node(number, null);
                head.setNext(head);
            } else {
                Node tempNodeForRemainingItems = head.getNext();
                head.setNext(new Node(head.getNumber(), tempNodeForRemainingItems));
                head.setNumber(number);
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            Node tempNodeForRemainingItems = tempNode.getNext();
            tempNode.setNext(new Node(number, tempNodeForRemainingItems));
        }
    }

    public void remove(int index) {
        if (index >= size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (size() == 1) {
            clear();
            return;
        }
        if (index == 0) {
            head.setNumber(head.getNext().getNumber());
            remove(index + 1);
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            Node tempNodeForRemainingItems = tempNode.getNext();
            tempNode.setNext(tempNodeForRemainingItems.getNext());
        }
    }

    public int get(int index) {
        if (index >= size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            return head.getNumber();
        }
        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode.getNumber();
    }

    public void print() {
        if (empty()) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            Node tempNode = head;
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber() + ", ");
                tempNode = tempNode.getNext();
            }
            System.out.println("\b\b]");
        }
    }

    public void clear() {
        head = null;
    }

    public int size() {
        if (empty()) {
            return 0;
        }
        int count = 0;
        Node tempNode = head;
        while (true) {
            count++;
            tempNode = tempNode.getNext();
            if (tempNode == head) {
                return count;
            }
        }
    }

    public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        Node tempNode = head;
        for (int i = 0; i < size(); i++) {
            if (tempNode.getNumber() == number) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public boolean empty() {
        return head == null;
    }
}
