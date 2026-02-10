public class code1 {
    public static void main(String[] args) {
        String s = "Java   is very powerful";
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
