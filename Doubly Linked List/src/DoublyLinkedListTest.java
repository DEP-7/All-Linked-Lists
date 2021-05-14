import ds.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList =new DoublyLinkedList();

        System.out.println("------------------------- Test for null linked list - start");
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        System.out.println("Linked List size = "+ doublyLinkedList.size());
        System.out.println("Is contains 10 --> "+ doublyLinkedList.contains(10));
        System.out.println("Is empty : "+ doublyLinkedList.empty());
        //System.out.println("Get 1st item : "+singlyLinkedList.get(0));
        //singlyLinkedList.remove(0);
        System.out.println("------------------------- Test for null linked list - end\n");

        System.out.println("------------------------- Test adding to linked list - start");
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.add(10);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.add(20);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.add(30);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.add(0,5);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.add(3,25);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        System.out.println("Linked List size = "+ doublyLinkedList.size());
        System.out.println("Is contains 10 --> "+ doublyLinkedList.contains(10));
        System.out.println("Is contains 55 --> "+ doublyLinkedList.contains(55));
        System.out.println("Is empty : "+ doublyLinkedList.empty());
        System.out.println("1st item : "+ doublyLinkedList.get(0));
        System.out.println("3rd item : "+ doublyLinkedList.get(2));
        System.out.println("4th item : "+ doublyLinkedList.get(3));
        System.out.println("------------------------- Test adding to linked list - end\n");

        System.out.println("------------------------- Test remove from linked list - start");
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.remove(3);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        doublyLinkedList.remove(0);
        System.out.print("Linked List Items : ");
        doublyLinkedList.print();
        System.out.println("------------------------- Test remove from linked list - end\n");

        System.out.println("------------------------- Test clear() method - start");
        System.out.print("Linked List Items before clear : ");
        doublyLinkedList.print();
        doublyLinkedList.clear();
        System.out.print("Linked List Items after clear : ");
        doublyLinkedList.print();
        System.out.println("------------------------- Test clear() method - end");
    }
}
