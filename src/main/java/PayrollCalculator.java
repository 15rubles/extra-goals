import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        if (hours > 40) {
            int overtime = hours - 40;
            System.out.printf("%s's gross pay is %.2f", name, payRate * hours + payRate * overtime * 1.5);
        } else {
            System.out.printf("%s's gross pay is %.2f", name, payRate * hours);
        }
    }
}
