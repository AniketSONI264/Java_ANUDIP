java.util.Scanner;
public class practice {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any Number");
    num1 = sc.nextInt();
    System.out.println("Square is :"+(num1*num1));
}

class inceDecre {
    public static void main(String[] args) {
       int a=10;
       int b=10;
        System.out.println(--a + a++ + b-- + ++b);
    }
}

import java.util.*;
class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Year :");
      int year = sc.nextInt();
    String result =
      (
        (year % 4 == 0 && year % 100 != 0)
          ? "is a leap year."
          : (year % 400 == 0) ? "is a leap year." : "is not a leap year."
      );
       System.out.println(result);
    }
}

import java.util.Scanner;

class expEmp {
    public double checkBonus(int exp, int sal) {
        return (exp >= 20 && exp < 50) ? (sal * 0.20) : (sal* 0.10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary and Experience:");

        
        int sal = sc.nextInt();
        int exp = sc.nextInt();
        expEmp employee = new expEmp();
        double bonus = employee.checkBonus(exp, sal); 
        System.out.println("Bonus: " + bonus);
    }
}
