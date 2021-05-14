package ds;

public class DoublyLinkedList {
    private Node head;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {
        if (index > size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            Node tempNodeForTailItems = head;
            head = new Node(number, tempNodeForTailItems, null);
            if (head.getNext()!=null){
                head.getNext().setPrevious(head);
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            Node tempNodeForTailItems = tempNode.getNext();
            tempNode.setNext(new Node(number, tempNodeForTailItems, tempNode));
            if (tempNodeForTailItems != null) {
                tempNodeForTailItems.setPrevious(tempNode.getNext());
            }
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
            Node tempNodeForTailItems = head;
            head = tempNodeForTailItems.getNext();
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            Node tempNodeForTailItems = tempNode.getNext();
            tempNode.setNext(tempNodeForTailItems.getNext());
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
            System.out.print("["); //print forward using next
            Node tempNode = head;
            Node tempNodeForBack = null;
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber() + ", ");
                tempNodeForBack = tempNode;
                tempNode = tempNode.getNext();
            }
            System.out.println("\b\b]");

            //print backward using previous to check the backward link continuity
            System.out.print("[");
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNodeForBack.getNumber() + ", ");
                tempNodeForBack = tempNodeForBack.getPrevious();
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
        while (tempNode != null) {
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
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
