import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readIntInRange(scanner, "Choose sandwich size (1 = Regular, 2 = Large): ", 1, 2);
        boolean loaded = readYesNo(scanner);
        int age = readIntInRange(scanner, "Your age: ", 0, 1000);

        double total = calculateTotalPrice(size, loaded, age);

        System.out.printf("Your sandwich costs: $%.2f%n", total);
    }

    static double calculateTotalPrice(int size, boolean loaded, int age) {
        double price = (size == 1) ? 5.45 : 8.95;
        if (loaded) {
            price += (size == 1) ? 1 : 1.75;
        }

        double discount = (age <= 17) ? 0.1 : (age >= 65) ? 0.2 : 0;

        return price * (1 - discount);
    }

    static int readIntInRange(Scanner scanner, String message, int min, int max) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value >= min && value <= max) {
                    return value;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Enter number from " + min + " to " + max);
        }
    }

    static boolean readYesNo(Scanner scanner) {
        while (true) {
            System.out.print("Do you want it loaded? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("yes")) return true;
            if (answer.equals("no")) return false;
            System.out.println("Answer yes or no");
        }
    }
}