public class Palindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        s = s.replaceAll("\\s+", "").toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
