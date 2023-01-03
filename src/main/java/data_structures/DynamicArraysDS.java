package data_structures;

import java.util.ArrayList;

public class DynamicArraysDS {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
        //

        DynamicArrayClass dynamicArrayClass = new DynamicArrayClass();

//        System.out.println(dynamicArrayClass.capacity);
        dynamicArrayClass.add("A");
        dynamicArrayClass.add("B");
        dynamicArrayClass.add("C");
        dynamicArrayClass.add("D");
        dynamicArrayClass.add("E");
        dynamicArrayClass.add("F");

        dynamicArrayClass.delete("A");
        dynamicArrayClass.delete("B");
        dynamicArrayClass.delete("c");

//
//        dynamicArrayClass.insert(0, "X");
//        dynamicArrayClass.delete("X");
//        dynamicArrayClass.insert(0, "A");
//        dynamicArrayClass.insert(1,"B");
//
        System.out.println(dynamicArrayClass);
        System.out.println("size " + dynamicArrayClass.size);
        System.out.println("capacity " + dynamicArrayClass.capacity);
        System.out.println("empty " + dynamicArrayClass.isEmpty());
//        System.out.println("index " + dynamicArrayClass.search("C"));

    }
}
