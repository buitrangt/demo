public class TemperatureClassifier {
    public static void main(String[] args) {
        double temperature = 39;

        if (temperature < 10) {
            System.out.println("Lạnh.");
        } else if (10 <= temperature && temperature < 38) {
            System.out.println("Vừa phải.");
        } else if (temperature >= 38) {
            System.out.println("Nóng.");
        }
    }
}
