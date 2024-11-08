// Create an abstract class Vehicle with an abstract method drive() and two concrete subclasses Car and Motorcycle that implement the drive() method.

// Constraints:
// Define the Vehicle class with an abstract drive() method.
// Define the Car and Motorcycle classes as concrete subclasses of Vehicle.
// Implement the drive() method in Car and Motorcycle to provide specific driving instructions.

public abstract class Vehicle{
    public abstract void drive();
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Car ...");
    }
}
class Motorcycle extends Vehicle{
     public void drive(){
        System.out.println("Motorcycle ...");
    }
}
class Test{
    public static void main(String[] args){
        Vehicle obj1 =new Car();
        Vehicle obj2 = new Motorcycle();
        obj1.drive();
        obj2.drive();
    }
}