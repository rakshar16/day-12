public class EmailValidation {
    public static void main(String[] args) {
        String email = "test@gmail.com";

        if (email.contains(" ") ||
            email.indexOf('@') <= 0 ||
            email.indexOf('@') != email.lastIndexOf('@') ||
            !email.contains(".")) {

            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
