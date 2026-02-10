public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))) {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
