package array2D;

public class TestMy2DArrays {
    public static void main(String[] args) {

        //2D array = an array of array ;

        String[][] cars = new String[3][3];
        cars[0][0] = "Audi";
        cars[0][1] = "BMW";
        cars[0][2] = "Chevrolet";
        cars[1][0] = "Dacia";
        cars[1][1] = "Mustang";
        cars[1][2] = "Camaro RR";
        cars[2][0] = "Tesla";
        cars[2][1] = "Lambo";
        cars[2][2] = "Suzuki";

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }

    }
}
