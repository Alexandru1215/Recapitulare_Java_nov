package random_val;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

        Random random = new Random();
        // pseudo random

            // 6 nr din 49 :))

        int a = random.nextInt(49)+1;
        System.out.println(a);
        int b = random.nextInt(49)+1;
        System.out.println(b);
        int c = random.nextInt(49)+1;
        System.out.println(c);
        int d = random.nextInt(49)+1;
        System.out.println(d);
        int e = random.nextInt(49)+1;
        System.out.println(e);
        int f = random.nextInt(49)+1;
        System.out.println(f);

        boolean y = random.nextBoolean();
        System.out.println(y);

        double z = random.nextDouble(); // aici obtinem rzultate intre 0 -1 ;
        System.out.println(z);


    }
}
