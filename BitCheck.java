// 3. Write a program to declare two variables num and n and take an input during compilation time to check whether the nth bit of the given number is set (1) or not (0).
import java.util.Scanner;

class BitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit position : ");
        int n = sc.nextInt();

        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit of " + num + " is 1.");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is 0.");
        }

        sc.close();
    }
}
