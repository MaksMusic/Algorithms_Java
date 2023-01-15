package Workin_with_Strings;

public class NumberOfLetters {
    public static void main(String[] args) {
        buildDictionary("Hello");
    }
    static void  buildDictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['ÿ' - 'à' + 1]; //32 length
        System.out.println('à'+ 1);
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'à' && ch <= 'ÿ'){
                result[ch - 'à']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'à') + " = " + result[i]);
        }
    }
}
