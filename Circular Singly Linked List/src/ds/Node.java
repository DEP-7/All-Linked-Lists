package ds;

public class Node {
    private int number;
    private Node node;

    public Node(int number, Node node) {
        this.number = number;
        this.node = node;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
