public class TrafficLightController {
    public static void main(String[] args) {

        String trafficLightColor = "đỏ";

        if (trafficLightColor.equals("đỏ")) {
            System.out.println("Dừng lại.");
        } else if (trafficLightColor.equals("vàng")) {
            System.out.println("Sẵn sàng.");
        } else if (trafficLightColor.equals("xanh")) {
            System.out.println("Đi.");
        } else {
            System.out.println("Trạng thái không hợp lệ.");
        }
    }
}
