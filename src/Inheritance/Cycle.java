package Inheritance;

import java.util.concurrent.Callable;

public class Cycle {
    /*
    int weight= 10;
    public void getWeight(){
        System.out.println(weight);
    }


    public static void main(String[] args){
        Cycle cycle = new Cycle();
        Bicycle bicycle= new Bicycle();
        cycle.getWeight();
        bicycle.getBrand();


    }
}
*/
int weight=10;

public void printInfo(){

System.out.println(weight);
}

public static void main(String[] args){

    Bicycle bicycle = new Bicycle();
    bicycle.printInfo();


        }

}
