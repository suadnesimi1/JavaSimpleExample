package Parameters;

public class Explicit {
    /*
  public static void main(String[] args){
      MyData mine=new MyData();
      mine.getArea(20);
      System.out.println(mine.getArea(20));

}
}
class MyData{


public int getArea(int side) {
    return side * side;
}
}
*/
// every parameter supplied to the method within its brackets becomes explicit parameter
// in this case int side = explicit parameter

public static void main(String[] args ){
    myData d1 = new myData();
    myData d2 = new myData();
    d1.myName="Suad";
    d2.myName="Adi";
    d1.display();
    d2.display();
}
}
class  myData{
    String myName;
    public void display(){
        System.out.println(myName);

    }
}

// this is implicit parameters example