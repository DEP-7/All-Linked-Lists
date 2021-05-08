import ds.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();

        System.out.println("------------------------- Test for null linked list - start");
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        System.out.println("Linked List size = "+singlyLinkedList.size());
        System.out.println("Is contains 10 --> "+singlyLinkedList.contains(10));
        System.out.println("Is empty : "+singlyLinkedList.empty());
        //System.out.println("Get 1st item : "+singlyLinkedList.get(0));
        //singlyLinkedList.remove(0);
        System.out.println("------------------------- Test for null linked list - end\n");

        System.out.println("------------------------- Test adding to linked list - start");
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.add(10);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.add(20);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.add(30);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.add(0,5);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.add(3,25);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        System.out.println("Linked List size = "+singlyLinkedList.size());
        System.out.println("Is contains 10 --> "+singlyLinkedList.contains(10));
        System.out.println("Is contains 55 --> "+singlyLinkedList.contains(55));
        System.out.println("Is empty : "+singlyLinkedList.empty());
        System.out.println("1st item : "+singlyLinkedList.get(0));
        System.out.println("3rd item : "+singlyLinkedList.get(2));
        System.out.println("4th item : "+singlyLinkedList.get(3));
        System.out.println("------------------------- Test adding to linked list - end\n");

        System.out.println("------------------------- Test remove from linked list - start");
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.remove(3);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        singlyLinkedList.remove(0);
        System.out.print("Linked List Items : ");
        singlyLinkedList.print();
        System.out.println("------------------------- Test remove from linked list - end\n");

        System.out.println("------------------------- Test clear() method - start");
        System.out.print("Linked List Items before clear : ");
        singlyLinkedList.print();
        singlyLinkedList.clear();
        System.out.print("Linked List Items after clear : ");
        singlyLinkedList.print();
        System.out.println("------------------------- Test clear() method - end");
    }
}
