package math.op;

import java.rmi.MarshalException;

public class TestSomeMath {
    public static void main(String[] args) {

        double x = 3.14;
        double y = 10; // -10;
        //compare values of x & y
        //double z = Math.max(x,y);
        //System.out.println(z);

        //abs  - absolute
//        double v = Math.abs(y);
//        System.out.println(v);



          // radacina patrata
        //double z =  Math.sqrt(y);

        //  unui nr a  este numarul cu propietatea ca y2 = a
        //De exemplu, 4 și −4 sunt rădăcinile pătrate
        // ale lui 16 deoarece 42 = (−4)2 = 16.
        //System.out.println( z);


//         double z = Math.round(x);
//          System.out.println(z);

        //double z = Math.ceil(x); // round up
         double z = Math.floor(x); // round down
        System.out.println(z);

    }
}
