package LinkedList;

//class linkedlist {
//    int data;
//    linkedlist next;
//    linkedlist(int data) {
//        this.data = data;
//        next = null;
//    }
//}

import java.util.LinkedList;

public class Oct18 {
    public static void main(String[] args) {
//        linkedlist l1 = new linkedlist(10);
//        linkedlist l2 = new linkedlist(20);
//        linkedlist l3 = new linkedlist(30);
//        linkedlist l4 = new linkedlist(40);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        linkedlist temp = l1;
//        while(temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        LinkedList<Integer> l = new LinkedList<Integer>();      // used from collection
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l);
    }
}