import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong.");
        } finally {
            scanner.close();
        }
    }
}
