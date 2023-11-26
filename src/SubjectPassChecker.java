public class SubjectPassChecker {
    public static void main(String[] args) {

        int subject1 = 60;
        int subject2 = 55;
        int subject3 = 58;
        if (subject1 >= 50 && subject2 >= 50 && subject3 >= 50) {
            System.out.println("Sinh viên đủ điều kiện qua môn.");
        } else {
            System.out.println("Sinh viên không đủ điều kiện qua môn.");
        }
    }
}
