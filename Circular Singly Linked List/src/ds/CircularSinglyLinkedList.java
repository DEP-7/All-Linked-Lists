package ds;

public class CircularSinglyLinkedList {
    private Node node;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {
        if (index > size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            if (node==null){
                node = new Node(number, null);
                node.setNode(node);
            }else {
                Node tempNodeForRemainingItems = node.getNode();
                node.setNode(new Node(node.getNumber(),tempNodeForRemainingItems));
                node .setNumber(number);
            }
        } else {
            Node tempNode = node;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNode();
            }
            Node tempNodeForRemainingItems = tempNode.getNode();
            tempNode.setNode(new Node(number,tempNodeForRemainingItems));
        }
    }

    /*public void remove(int index) {
        if (index >= size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (size() == 1) {
            clear();
            return;
        }
        if (index == 0) {
            Node tempNodeForRemainingItems = node;
            node = tempNodeForRemainingItems.getNode();
        } else {
            Node tempNode = node;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNode();
            }
            Node tempNodeForRemainingItems = tempNode.getNode();
            tempNode.setNode(tempNodeForRemainingItems.getNode());
        }
    }*/

    /*public int get(int index) {
        if (index >= size() || index < 0) {
            throw new RuntimeException("Invalid index. Array size is " + size());
        }
        if (index == 0) {
            return node.getNumber();
        }
        Node tempNode = node;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNode();
        }
        return tempNode.getNumber();
    }*/

    public void print() {
        if (empty()) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            Node tempNode = node;
            for (int i = 0; i < size(); i++) {
                System.out.print(tempNode.getNumber() + ", ");
                tempNode = tempNode.getNode();
            }
            System.out.println("\b\b]");
        }
    }

    public void clear() {
        node = null;
    }

    public int size() {
        if (empty()) {
            return 0;
        }
        int count = 0;
        Node tempNode = node;
        while (true) {
            count++;
            tempNode = tempNode.getNode();
            if (tempNode == node) {
                return count;
            }
        }
    }

    /*public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        Node tempNode = node;
        for (int i = 0; i < size(); i++) {
            if (tempNode.getNumber() == number) {
                return true;
            }
            tempNode = tempNode.getNode();
        }
        return false;
    }*/

    public boolean empty() {
        return node == null;
    }
}
