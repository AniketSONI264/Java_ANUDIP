class Animal{
    public void makeSound(){
        System.out.println("All the Animals Makes Sound...");
    }
}
class Dog extends Animal{
    @Override
   public void makeSound(){
        System.out.println("The Dog barks...");
    }
}
class Cat extends Animal{
    @Override
   public void makeSound(){
        System.out.println("The Cat mows...");
    }
}

public class test{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.makeSound();
        dog.makeSound();
    }
}
