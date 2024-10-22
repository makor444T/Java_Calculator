public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Select an operation (+, -, *, /, sqrt): ");
            String operation = scanner.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                case "sqrt":
                    result = calculator.sqrt(num1);
                    break;
                default:
                    System.out.println("Incorrect.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException | InvalidInput e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: invalid input.");
        } finally {
            System.out.println("Done!");
            scanner.close();
        }
    }
}