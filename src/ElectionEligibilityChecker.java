public class ElectionEligibilityChecker {
    public static void main(String[] args) {
        int candidateAge = 30;
        String candidateNationality = "Viet Nam";

        if (candidateAge >= 18 && candidateNationality.equals("Viet Nam")) {
            System.out.println("Đủ điều kiện bầu cử.");
        } else {
            System.out.println("Không đủ điều kiện bầu cử.");
        }
    }
}
