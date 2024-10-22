class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Dividing by zero.");
        }
        return a / b;
    }

    public double sqrt(double a) throws InvalidInput {
        if (a < 0) {
            throw new InvalidInput("The number cannot be less than zero.");
        }
        return Math.sqrt(a);
    }
}