public class GradeClassifier {
    public static void main(String[] args) {
        double mark = 75.5;

        if (0 <= mark && mark < 45) {
            System.out.println("F");
        } else if (45 <= mark && mark < 55) {
            System.out.println("D");
        } else if (55 <= mark && mark < 65) {
            System.out.println("C");
        } else if (65 <= mark && mark < 80) {
            System.out.println("B");
        } else if (80 <= mark && mark <= 100) {
            System.out.println("A");
        }
    }
}
