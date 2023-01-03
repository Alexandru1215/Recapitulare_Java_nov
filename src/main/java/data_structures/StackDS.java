package data_structures;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");

        //  stack  =  LIFO - data structure.  Last-In First-Out
        //             stores obj into sort of "vertical tower"
        //             push() to add to the top
        //             pop() to remove from the top

        Stack<String> theStack = new Stack<String>();

        System.out.println(theStack.empty());

        theStack.push("Game 1");   // 0
        theStack.push("Game 2");   // 1
        theStack.push("Game 3");   // 2
        theStack.push("Game 4");   // 3

//        System.out.println(theStack.empty());
//        System.out.println(theStack);
//        theStack.pop();
//        System.out.println(theStack);
//        theStack.pop();
//        System.out.println(theStack);
//        theStack.pop();
//        System.out.println(theStack);
//        theStack.pop();
//        System.out.println(theStack);
        // String myFavGame =  theStack.pop();

        // System.out.println(myFavGame);
        // System.out.println(theStack.peek());
        // System.out.println(theStack.search("Game 5"));

//        for(int i =0; i<1000000000;i++){
//            theStack.push("Game 5");      // out of memory - Java heap space
//        }
        // use of stack ?!
        // 1. undo/redo  features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling function (call stack)

        Stack<String> stack01 = new Stack<String>();
        System.out.println(stack01.empty());
        stack01.push("MineCraft");
        stack01.push("SkyRim");
        stack01.push("SuperMario");
        stack01.push("FinalFantasyVII");


        //      stack01.pop(); // remove top
//        stack01.pop();
//        stack01.pop();
//        stack01.pop();
//        stack01.pop();

        // String myFav =  stack01.pop();
//
//        System.out.println(stack01.peek());//afisam ultimul item
//
//        System.out.println(stack01); // afisam lista

        System.out.println(stack01.search("FinalFantasyVII"));

        for (int i = 0; i < 100000000; i++) {
            stack01.push("SuperMario");
        }

    }
}
