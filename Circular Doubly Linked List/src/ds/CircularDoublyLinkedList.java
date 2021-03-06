package ds;

public class CircularDoublyLinkedList {
    private Node head;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {
        if (index > size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            if (head==null){
                head=new Node(number,null,null);
                head.setNext(head);
                head.setPrevious(head);
            }else {
                Node tempNodeForRemainingItems = head.getNext();
                head.setNext(new Node(head.getNumber(), tempNodeForRemainingItems,head));
                head.setNumber(number);
                tempNodeForRemainingItems.setPrevious(head.getNext());
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            Node tempNodeForRemainingItems = tempNode.getNext();
            tempNode.setNext(new Node(number, tempNodeForRemainingItems, tempNode));
            tempNodeForRemainingItems.setPrevious(tempNode.getNext());
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
            tempNodeForRemainingItems.getNext().setPrevious(tempNode);
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
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber() + ", ");
                tempNode = tempNode.getNext();
            }
            System.out.println("\b\b]");

            //print backward using previous to check the backward link continuity
            /*System.out.print("[");
            tempNode=head.getPrevious();
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber() + ", ");
                tempNode = tempNode.getPrevious();
            }
            System.out.println("\b\b]");*/
        }
    }

    public void clear() {
        head = null;
    }

    public int size() {
        if (empty()) {
            return 0;
        }
        int count = 1;
        Node tempNode = head.getNext();
        while (tempNode != head) {
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
