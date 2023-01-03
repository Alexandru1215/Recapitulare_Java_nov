package math.op;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {


//hipotenuza unui tri

        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side x :");
        x = sc.nextDouble();

        System.out.println("Enter side y :");
        y = sc.nextDouble();
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("the hypotenuse is  :" + z);
        sc.close();
    }
}
