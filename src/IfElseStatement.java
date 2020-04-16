import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        int number = 10;
        Scanner input = new Scanner(System.in);

        // prompt user for integer
        System.out.println("Enter an integer: ");
        // assign the input to number
        number = input.nextInt();
        // if else statement
        if (number > 10) {
            System.out.println("Number entered is greater than 10");
        } else if (number < 10) {
            System.out.println("Number entered is less than 10");
        } else {
            System.out.println("Number entered is equal to 10.");
        }
        System.out.println("Application finished.");
    }
}
