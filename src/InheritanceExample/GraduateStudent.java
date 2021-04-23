package InheritanceExample;

public class GraduateStudent extends Student{
    String graduateDate = "December 2020";

    public void printProperties(){
        super.printProperties();
        System.out.println("Graduation: "+graduateDate);
    }

}
