public class VowelReplacement {

    public static void main(String[] args) {
        System.out.println(replaceVowelsWithAsterisk("Hello"));
    }
    public static String replaceVowelsWithAsterisk(String input) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                sb.setCharAt(i, '*');
            }
        }

        return sb.toString();
    }
}
