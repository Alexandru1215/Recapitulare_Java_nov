package oop.clase;

public class MainC {
    public static void main(String[] args) {
        System.out.println("Sit back. Relax. Enjoy the show!");


        //  Construct an instance of another class

        Car myCar = new Car();   // new Object -
        Car myCar2 = new Car(); // You can create how many obj  you want

        System.out.println(myCar.model);
        System.out.println(myCar.price);
        System.out.println(myCar2);       //address
        System.out.println(myCar.color);  // when  you wanna display or acces attribute of Obj

        myCar.brake();   //  when I wanna call /  invoke the method of object
        myCar.drive();


    }
}
