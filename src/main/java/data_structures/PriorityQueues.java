package data_structures;

import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");

        //Priority Queue =  A FIFO data structure that serve elements
        //          with the highest priorities first
        //           before elements with lower priority


         Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // sa le putem pune in ordine inversa

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        //Collections.reverseOrder()
//        Queue<String> queueStrings = new PriorityQueue<>();
//        queueStrings.offer("A");
//        queueStrings.offer("C");
//        queueStrings.offer("D");
//        queueStrings.offer("B");
//        queueStrings.offer("E");


//        System.out.println(queueStrings);

        while (!queue.isEmpty()) {   // punem in ordine
            System.out.println(queue.poll());
        }
    }
}
