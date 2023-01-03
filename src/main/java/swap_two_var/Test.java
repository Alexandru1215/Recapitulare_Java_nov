package swap_two_var;

public class Test {
    public static void main(String[] args) {

        System.out.println("Sit  back, Relax, Enjoy the show!");

        String x = "water";
        String y = "Cola-Bomb";
        String temp;                         // 1 aducem un recipent nou

        System.out.println("Before");
        System.out.println("x: -" + x);
        System.out.println("y: -" + y);

        temp = x;                              // 2 punem x in temp
        x = y;                                // 3 punem y  in locul lui x
        y = temp;                             //  4 punem x din temp in y
        System.out.println("After");
        System.out.println("x: -" + x);
        System.out.println("y: -" + y);


    }
}
