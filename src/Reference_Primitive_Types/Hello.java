package Reference_Primitive_Types;

public class Hello {
    public static void main(String[] args){

        // primitiveTypes
        /*
        int x=13;
        int y=x;
        System.out.println(x+ " " +y+ " before");
        y=10;
        System.out.println(x+ " "+y+ " after");
*/
        // Reference Type
        Test myTest=new Test();
        Test yourTest=myTest;
        System.out.println(myTest.message+" "+yourTest.message+ " before");
        yourTest.change();
        System.out.println(myTest.message+" "+yourTest.message+ " after");

    }

}
class Test{
    String message="hi";
    public void change(){
        message="bye";
    }
}
