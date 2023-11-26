public class PasswordValidator {
    public static void main(String[] args) {

        String password = "trang123";

        if (password.length() >= 6) {
            if (Character.isDigit(password.charAt(0)) ||
                    Character.isDigit(password.charAt(1)) ||
                    Character.isDigit(password.charAt(2)) ||
                    Character.isDigit(password.charAt(3)) ||
                    Character.isDigit(password.charAt(4)) ||
                    Character.isDigit(password.charAt(5))) {
                System.out.println("Mật khẩu hợp lệ.");
            } else {
                System.out.println("Mật khẩu cần chứa ít nhất một số.");
            }
        } else {
            System.out.println("Mật khẩu không hợp lệ. Mật khẩu cần có ít nhất 6 ký tự.");
        }
    }
}
