import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        scanner.nextLine();
        String selection = scanner.nextLine();
        switch (selection) {
            case "A":
                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;
            case "S":
                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;
            case "M":
                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;
            case "D":
                System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                break;
        }

    }
}
