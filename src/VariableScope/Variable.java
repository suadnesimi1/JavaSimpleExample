package VariableScope;


/*kemi nje error dhe keto jane arsyet se pse e kemi:
name has a special value called null
null means it refers to no object at all
cannot call method on a reference whose value is null
exception in thread "main" java.lang.NullPointerException
bone run programin de e shofish se de dale cki error.
 */
/*
public class Variable {

    String name;
    public void display(){
        System.out.println(name.length());
    }

    public static void main(String[] args){
        Variable variable = new Variable();
        variable.display();
    }
}
*/

public  class Variable{

    String firstname; // instancevariable
    String lastname;  // instancevariable
    boolean test;     // instancevariable
    public void display(/*parametervariable*/ ){
        int no=1; // local variable
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(test);
        System.out.println(no);
    }
    public static void main(String[] args){
        Variable variable = new Variable();
        variable.firstname= "suad"; // instancevariablave u japim vler prej ktau
        variable.lastname="nesimi";
        variable.test=true;
        variable.display();

    }
}