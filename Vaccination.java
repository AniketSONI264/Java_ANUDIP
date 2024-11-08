import java.util.Scanner;

abstract class Vaccine 
{
    int age;
    String nlt; // nlt = Nationality
    Boolean fd = false, sd = false;

    public Vaccine(int num, String str) {
        this.age = num;
        this.nlt = str;
    }
    public void firstDose() {
        if (age >= 18 && nlt.equalsIgnoreCase("indian")) {
            System.out.println("You're eligible to take the vaccine ... And you'll have to pay 250rs. Thanks... :)");
            fd = true;
        } else {
            System.out.println("You're not eligible....  :(");
        }
    }

    public void secondDose() {
        if (fd) {
            System.out.println("Go for the second dose...  :)");
            sd = true;
        } else {
            System.out.println("Not eligible for the second dose...  :(");
        }
    }

    public abstract void boosterDose();
}

public class vaccinationSuccessful extends Vaccine 
{
    public vaccinationSuccessful(int num, String str) {
        super(num, str);
    }
    
    @Override
    public void boosterDose() {
        if (sd) {
            System.out.println("You're Ready to take the booster dose... :)");
        } else {
            System.out.println("You're not eligible for the booster dose... :|");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter your nationality: ");
        String str = sc.nextLine();
        str = str.toLowerCase(); 
        Vaccine vc = new vaccinationSuccessful(num, str);
        vc.firstDose();
        vc.secondDose();
        vc.boosterDose();
        sc.close(); 
    }
}
