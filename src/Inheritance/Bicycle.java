package Inheritance;

public class Bicycle extends Cycle{
    /*
    String brand="Bike";
    public void getBrand(){
        System.out.println(brand);
    }
}
*/

String brand="Bike";
        public void printInfo(){
    super.printInfo();
    System.out.println(brand);
}
}