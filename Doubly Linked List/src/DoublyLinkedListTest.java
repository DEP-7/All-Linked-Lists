import ds.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList numList =new DoublyLinkedList();

        System.out.println("------------------------- Test for null linked list - start");
        System.out.print("Linked List Items : ");
        numList.print();
        System.out.println("Linked List size = "+ numList.size());
        System.out.println("Is contains 10 --> "+ numList.contains(10));
        System.out.println("Is empty : "+ numList.empty());
        //System.out.println("Get 1st item : "+singlyLinkedList.get(0));
        //singlyLinkedList.remove(0);
        //numList.add(8,25);
        System.out.println("------------------------- Test for null linked list - end\n");

        System.out.println("------------------------- Test adding to linked list - start");
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(10);
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(20);
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(30);
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(0,5);                    // Add to first element
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(numList.size(),40);            // Add to last element
        System.out.print("Linked List Items : ");
        numList.print();
        numList.add(3,25);                   // Add to middle element
        System.out.print("Linked List Items : ");
        numList.print();
        System.out.println("Linked List size = "+ numList.size());
        System.out.println("Is contains 10 --> "+ numList.contains(10));
        System.out.println("Is contains 55 --> "+ numList.contains(55));
        System.out.println("Is empty : "+ numList.empty());
        System.out.println("1st item : "+ numList.get(0));
        System.out.println("3rd item : "+ numList.get(2));
        System.out.println("4th item : "+ numList.get(3));
        System.out.println("------------------------- Test adding to linked list - end\n");

        System.out.println("------------------------- Test remove from linked list - start");
        System.out.print("Linked List Items : ");
        numList.print();
        numList.remove(3);                           // Remove middle element
        System.out.print("Linked List Items : ");
        numList.print();
        numList.remove(0);                           // Remove first element
        System.out.print("Linked List Items : ");
        numList.print();
        numList.remove(numList.size()-1);            // Remove last element
        System.out.print("Linked List Items : ");
        numList.print();
        System.out.println("------------------------- Test remove from linked list - end\n");

        System.out.println("------------------------- Test clear() method - start");
        System.out.print("Linked List Items before clear : ");
        numList.print();
        numList.clear();
        System.out.print("Linked List Items after clear : ");
        numList.print();
        System.out.println("------------------------- Test clear() method - end");
    }
}
