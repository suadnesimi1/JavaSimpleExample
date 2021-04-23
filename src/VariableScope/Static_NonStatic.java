package VariableScope;

public class Static_NonStatic {
}

    class Example {

        // static method
        static void myStatic() {
            System.out.println("This is called without creating object");
        }

        // non static method
        public void myPublic() {
            System.out.println("This is not called without creating an object");
        }

        public static void main(String[] args) {
            myStatic();
            //myPublic(); error

            //create an object to call the public method
            Example ex= new Example();
            ex.myPublic();


        }
    }
