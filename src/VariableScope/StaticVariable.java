package VariableScope;

public class StaticVariable {



     /*
    public static void main(String[] args) {

        System.out.println(Test.id);
        System.out.println(Test.myCondition);
        System.out.println(Test.a);
        System.out.println(Test.b);

    }
}
class Test{
    static int id;
    static Object b;
    static boolean myCondition;
    static char a;

}
*/

    // difference between static and non static variables - run both of examples to see the diff

    //example1
    /*
    public static void main(String[] args){
        Test t=new Test();
        Test t1= new Test();
    }
    }


class Test {
    int count = 0;

    Test() {
        count++;
        System.out.println(count);
    }
}
*/
    //example 2
public static void main(String[] args){
    Test t= new Test();
    Test t2= new Test();
}
}

class Test{
    static int count=0;
    Test(){
        count++;
        System.out.println(count);
    }
}