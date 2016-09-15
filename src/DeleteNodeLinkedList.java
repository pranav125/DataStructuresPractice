/**
 * Created by sony on 4/12/2016.
 * Delete a given node with value in a linked list
 */
import java.util.*;

class Node {
    Node next;
    int data;

//    public Node(int val) {
//        data = val;
//        next = null;
//    }
}

public class DeleteNodeLinkedList {

    public static void main(String[] args){
        Node head = new Node();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0 ; i < n; i++) {
            int nums = in.nextInt();
        }
        //in.close();
        System.out.println("Enter the node to be deleted:");
        int value = in.nextInt();
        deleteNode(head,value);


    }
        public static void deleteNode(Node head, int value){
            Node temp = head;
            while(temp!=null){
                if(temp.next.data == value ){
                    temp.next = temp.next.next;
                }
            }
        }

}
