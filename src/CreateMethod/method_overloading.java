/*
package CreateMethod;

public class method_overloading {

    public static void main(String args[]){
        Maths maths=new Maths();
        double no=maths.max(5.0,6.0);
        System.out.println(no);
    }
}

class Maths{
    public int max(int x, int y){
        int max=0;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("Integer version is called");
        return max;
    }
    public double max(double x,double y){
        double max=0;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("Double version called");
        return max;
    }
}



*/
// gjithashtu mund ta perdorim edhe kete form duket i dhane x vleren integer
// dhe y vleren double, por do te printohet prap methoda dobule
// sepse rendesia eshte qe mos te hupim data, qe i bie nese i japim x=5
// dhe y=7.0, perdoret methoda double sepse nuk hupim data
// nese e perdorim methoden int ather i bie qe hupim data prej 7.0 duhet te shkojm ne 7

package CreateMethod;

public class method_overloading {

    public static void main(String args[]){
        Maths maths=new Maths();
        double no=maths.max(5,7.0);
        System.out.println(no);
    }
}

class Maths{
    public int max(int x, int y){
        int max=0;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("Integer version is called");
        return max;
    }
    public double max(double x,double y){
        double max=0;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("Double version called");
        return max;
    }
}



