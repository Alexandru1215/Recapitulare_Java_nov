package expression;

public class TestExpression {
    public static void main(String[] args) {

        // expression  =  operands  & operators
        // operands    =  values, variables , numbers , quantity
        // operators   =   + - * / %

        //double friends = 10;
          int friends = 10;
        // friends++;
        System.out.println(++friends);      // incrementeaza cu 1
        System.out.println(++friends);      // aduna cu 1
        friends = friends + 20;         // adauga
        System.out.println(friends);
        System.out.println(--friends); // minus
        friends = friends % 2;   // ce ramane
        System.out.println(friends);
        // friends = (double) friends /3; // am trecut in decimal,dar nu prea e logic sa zici
                                        // ca a ramas 0,333 dintr un prieten
        System.out.println(friends);


    }
}
