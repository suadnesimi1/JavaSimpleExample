package Class_Object;

public class AreaOfCircle {


    public static void main(String[] args){
        Circle c= new Circle(); // saying int i=2.5 directly assigns memory for storing 2.5 but saying circle c does not. thats why we use this form
        c.radius=4.8;
        c.area=3.14*c.radius*c.radius;
        System.out.println(c.area);

    }
}
class Circle{
    double radius; // properties of Circle c
    double area;  // properties of Circle c
}

/*
Circle c = new Circle();
c = name of variable that will store an object of type Circle
new = create memory for the object
Circle() = give default values for all the Properties of c. Ne kete rast u jep vlera propertive ose radiusit dhe areas = 0;
c.radius = radius value for object c;
 */













