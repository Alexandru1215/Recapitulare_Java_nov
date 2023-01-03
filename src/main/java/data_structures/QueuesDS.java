package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDS {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
        //***********************************************************************
        // Queues = FIFO  data structure. First-In First-Out - ex - line of ppl
        //     A collection designed for holding elements prior processing
        //     Linear data structure
        //     add = enqueue . offer();
        //     remove = dequeue . poll();
        //***********************************************************************
            // este o interfata si doar 2 o implementeaza  PriorityQueue si  LinkedList
        Queue<String> queue =  new LinkedList<>();


        System.out.println(queue.isEmpty());
        queue.offer("Game 1");
        queue.offer("Game 2");
        queue.offer("Game 3");

        //  System.out.println(queue.isEmpty());
        //   System.out.println(queue.size());
        //  System.out.println(queue.contains("Game 3"));
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.contains("Game 1"));
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        queue.poll();
//        System.out.println(queue);   // remove Game 1
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        System.out.println(queue);  // don t trow Exception


        // Where is useful?
        // 1.  Keyboard Buffer (letter should apear on the screen in the order  they re pressed)
        // 2.  Printer Queue (Print Jobs should be completed in order)
        // 3.  Used in LinkedList, PrioryQueues,  Breadth-first search

    }
}
