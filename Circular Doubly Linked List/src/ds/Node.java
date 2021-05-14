package ds;

public class Node {
    private int number;
    private Node next;
    private Node previous;

    public Node(int number, Node next, Node previous) {
        this.number = number;
        this.next = next;
        this.previous = previous;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
