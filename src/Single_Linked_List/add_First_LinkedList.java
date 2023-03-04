package Single_Linked_List;

import java.util.*;

public class add_First_LinkedList {
    public static Node addValueBeforeHead(Node head, int k) {
        if (head == null) {
            System.out.print("Empty List");
        } else {
            //create a new Node and store the value;
            Node new_Node = new Node(k);
            new_Node.next = head;
            head = new_Node;
        }
        return head;
    }
}
