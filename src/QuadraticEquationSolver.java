public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Directly assign values to a, b, c
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two distinct roots:");
            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has a double root:");
            System.out.println("root = " + root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
