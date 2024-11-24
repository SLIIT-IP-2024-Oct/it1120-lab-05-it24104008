import java.util.Scanner;

public class IT24104008Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        System.out.println("Enter number 3:");
        int num3 = input.nextInt();

        // Find the smallest number
        int smallest;
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        // Find the largest number
        int largest;
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output the results
        System.out.println("User entered numbers: " + num1 + " " + num2 + " " + num3);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        input.close();
    }
}