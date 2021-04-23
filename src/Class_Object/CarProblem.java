package Class_Object;


//this is our problem solved below
/*a car has a certain fuel efficiency or mileage and certain amount of fuel in the gas
tank and the initial fuel level is 0. simulate driving the car for a certain distance, reducing the
amoun of gasoline in the fuel tank. also find a way to get the current amount of fuel in the gas tank and also fill gas
in the tank. ensure that you take the car's mileage into account for all this
 */

public class CarProblem {

    public static void main(String[] args){
        Car myCar=new Car();
        myCar.fuelCapacity=20; // kapaciteti i rezervarit
        myCar.amountOfFuel=12; // sa litra benzin kina ne rab
        myCar.addGas(2); // sa litra benzin i kina shtaj
        myCar.mileage=15; // harxhon 15litra per km
        myCar.drive(10);//sa km du te heci
        System.out.println(myCar.amountOfFuel); // kjo e printon amountoffuel+addgass


    }

}
class Car {
    double mileage;
    double amountOfFuel;
    double fuelCapacity;

    public void drive(double distance) {
        double fuelNedded=distance/mileage;
        if(amountOfFuel>=fuelNedded){
            amountOfFuel=amountOfFuel-fuelNedded;
            System.out.println("You travelled " +distance+ "km");
        }else{
            System.out.println("You dont have fuel");
        }


    }

    public void addGas(double amount) {
        double emptySpace = fuelCapacity - amountOfFuel; //5
        if (amount < emptySpace) {
            amountOfFuel = amountOfFuel + amount; // 25 liters, 10 liter
            System.out.println(amount + " liters was added succesfully");
        } else {
            amountOfFuel = fuelCapacity; // mycar is completly full
            System.out.println("Now your tank is full");
        }


    }

    public double getFuelLevel() {
        return amountOfFuel;

    }
}