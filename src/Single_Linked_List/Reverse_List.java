package Single_Linked_List;

public class Reverse_List {
    public static Node reverse_List(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node new_Node = reverse_List(head.next);
        head.next.next = head;
        head.next = head;

        return new_Node;
    }
}
