package arrays;

public class TestArray {
    public static void main(String[] args) {
        // array= used to store multiple values in a single variable

        //  String car = "Camaro";

        String[] cars = {"Camaro", "Audi", "Bmw"};
        for (String s : cars) {
            System.out.println(s);
//           if(car[i].equals("Audi")){
//               System.out.println(car[i]);
//           }
            //  System.out.println(i);
        }
        System.out.println('\n');
        String[] carss = new String[3];
        carss[0] = "Dacia";
        carss[1] = "Renault";
        carss[2] = "Peugeot";
        for (String c : carss) {
            System.out.println(c);
        }
    }
}
