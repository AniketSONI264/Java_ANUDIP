//Q2. Wap to check the experience of an employee, if exp is greater than 20 years then calculate bonus=20% salary, else calculate bonus = 10% of salary.
import java.util.Scanner;

class Empexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your years of experience: ");
        int exp = sc.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble(); 
        
        double bonus = (exp >= 20 && exp <= 50) ? salary * 0.20 : salary * 0.10; 
        
        System.out.println("Bonus Salary (Based on your Experience) is: " + bonus);
  
        sc.close();
    }
}
