package data_structures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayLists {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
//
//
//        LinkedList<String> linkedList = new LinkedList<String>();
////        linkedList.push("Game A");
////        linkedList.push("Game B");
////        linkedList.push("Game C");
////        linkedList.push("Game D");
////        linkedList.push("Game F");
//        //  linkedList.pop(); //  remove last
//
//
//        // LinkedList like  Queue
//        linkedList.offer("Game A");
//        linkedList.offer("Game B");
//        linkedList.offer("Game C");
//        linkedList.offer("Game D");
//        linkedList.offer("Game F");
////        linkedList.poll();  //  remove 1st
//
//
//        linkedList.add(4, "Game E");
//        linkedList.remove("Game E");
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.peekLast());
//        linkedList.add(0, "Game G");
//        System.out.println(linkedList.removeFirst());
//
//        System.out.println(linkedList);


        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapseTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList1.add(i);
            arrayList1.add(i);
        }


        //------------ LinkedList ----------------------
        startTime = System.nanoTime();   // start

        //do something

        // linkedList1.add(0);
        // linkedList1.remove(0);
        // linkedList1.get(0);
        // linkedList1.get(999999);
        linkedList1.remove(900000);


        endTime = System.nanoTime();    // finish

        elapseTime = endTime - startTime;   // formula
        System.out.println("LinkedList:\t" + elapseTime + " ns");

        //------------ ArrayList ----------------------
        startTime = System.nanoTime();   // start

        //do something

        // arrayList1.add(0);
        // arrayList1.remove(0);
        // arrayList1.get(0);
        // arrayList1.get(999999);
        arrayList1.remove(900000);

        endTime = System.nanoTime();    // finish

        elapseTime = endTime - startTime;   // formula
        System.out.println("ArrayList:\t" + elapseTime + " ns");

        //------------ results ---
        // 1. adding Element - ArrayList
        // 2. remove Element -  LinkedList
        // 3. remove last Element -  ArrayList :)
        // 3. get 1st Element - ArrayList
        // 4. get Element in middle = ArrayList
        // 5. get last Element = ArrayList
    }
}
