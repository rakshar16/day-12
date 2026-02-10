public class LongestWord {
    public static void main(String[] args) {
        String s = "Java is extremely powerful";
        String[] words = s.split(" ");

        String longest = words[0];

        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
