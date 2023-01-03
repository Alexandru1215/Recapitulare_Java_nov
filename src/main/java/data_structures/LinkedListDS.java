package data_structures;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
//*************************************************************************
        // LinkedList - store Nodes in 2 parts (data + address)
        //              Nodes are in non- consecutive memory location
        //              Elements are linked using pointers

        //                         Doubly Linked List
        //            Node                        Node                          Node
        //      [address| data | address]<->[address | data | address]<->[address | data | address]

        // advantages?
        //1. Dynamic Data Structure (allocate needed memory while running)
        //2. Insertion and Deletion of Nodes is easy. O(1)
        //3. No/ Low memory waste


        //disadvantages
        //1. Greater memory usage (additional pointer)
        //2. No random  access of elements (no index [i])
        //3. Accessing / searching elements is more time consuming. O(n)


        // uses?
        //1. Implement Stack / Queues
        //2. GPS navigation
        //3. music playlist
//*************************************************************************

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.offer("G");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");
        //linkedList.pop();

//        linkedList.add(4,"H");
//        linkedList.remove("H");
        //    System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("Z");

        System.out.println(linkedList);

        linkedList.removeLast();

        System.out.println(linkedList);


    }
}
