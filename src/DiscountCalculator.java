public class DiscountCalculator {
    public static void main(String[] args) {

        double totalAmount = 600.0;
        double discount = 0;

        if (totalAmount > 500) {
            discount = totalAmount * 0.2;
        } else if (totalAmount > 100) {
            discount = totalAmount * 0.1;
        }
        double finalAmount = totalAmount - discount;
        System.out.println("Số tiền mua hàng: $" + totalAmount);
        System.out.println("Giảm giá: $" + discount);
        System.out.println("Số tiền phải thanh toán: $" + finalAmount);
    }
}
