package InheritanceExample;

public class Person {
    String name="Suad";
    int age = 21;
    String address = "NorthMacedonia";

    public void printProperties(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);

    }
    public static void main(String[] args){
        Person p = new Person();
        Student s= new Student();
        GraduateStudent g = new GraduateStudent();

        g.printProperties();




    }
}
