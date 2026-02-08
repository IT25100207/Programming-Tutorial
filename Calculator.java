class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Square
    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int exp1 = cal.square(
                        cal.add(
                            cal.multiply(3, 4),
                            cal.multiply(5, 7)
                        )
                    );

        // Expression 2: (4 - 7)^2 + (8 + 3)^2
        int exp2 = cal.add(
                        cal.square(cal.add(4, 7)),
                        cal.square(cal.add(8, 3))
                    );

        // Output results
        System.out.println("(3 * 4 + 5 * 7)^2 = " + exp1);
        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + exp2);
    }
}
