package InheritanceExample;

public class Student extends Person{
    String studentNo="100044162";
    double average = 2.67;//out of 4


    public  void printProperties(){
        super.printProperties();
        System.out.println("Average: "+average);
        System.out.println("Student Number: "+studentNo);
    }
}
