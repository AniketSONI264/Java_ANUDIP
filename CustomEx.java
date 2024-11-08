// Custom Exception for Negative Age

// Question: Create a custom exception called NegativeAgeException. Write a method that takes a person's age as input and throws NegativeAgeException if the age is negative. Catch this exception in the main method and print an error message.
// Hint: Extend Exception class to create NegativeAgeException, and use throw to raise it.
class NegativeAgeException extends Exception{
    
    public NegativeAgeException(String str){
        super(str);
    }
}

class testException {
    public static void test(int age){
        try{
            if (age<=0){
                throw new NegativeAgeException("Age Can't be Negative...");
            }
            else{
                System.out.println("Good Input...");
            }
        } catch(NegativeAgeException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        test(20);
        test(0);
    }
}