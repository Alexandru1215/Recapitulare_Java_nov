package nestedLoops;

import java.util.Scanner;

public class testMyLoops {
    public static void main(String[] args) {
        //nested loops = loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;             // 1 st loop  - outerloop
        int columns;          //  2nd loop - inner loop
        String symbol;
        System.out.println("Enter  # of rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns : ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use :");
        symbol=scanner.next();

        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
