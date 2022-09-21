
    /*
    Create MyOwnAutoShop class which contains the main() method. Perform the following within the main()
    method.
    ◦Create an instance of Sedan class and initialize all the fields with appropriate values. Use super(...)
    method in the constructor for initializing the fields of the superclass.
    ◦Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...)
    method in the constructor for initializing the fields of the super class.
    ◦Create an instance of Car class and initialize all the fields with appropriate values.
    Display the sale prices of all instance
    */

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan mySedan = new Sedan(170, 32000, "Pink", 10);
        Truck myTruck = new Truck(180, 55000, "Black", 11);
        Ford myFord = new Ford(160, 20000, " White ");
        Car myCar = new Car(180,45000, "Purple");


        System.out.println("MySedan Price" + mySedan.getSalePrice());
        System.out.println("MyTruck Price" + myTruck.getSalePrice());
        System.out.println("MyFord Price" + myFord.getSalePrice());
        System.out.println("MyCar Price" + myCar.getSalePrice());

    }
}
