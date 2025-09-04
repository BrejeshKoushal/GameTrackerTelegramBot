package Practice;

public class ValidWord {
    public static boolean isValid(String word) {
        word = word.toLowerCase();
        if(word.length()<3) return false;
        int vow = 0;
        int cons = 0;
        int num = 0;
        for (int i = 0 ; i < word.length();i++){
            char ch = word.charAt(i);
            if (ch=='@' || ch=='#' || ch=='$'){
                return false;
            }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                }
                else if(ch>='0' && ch<='9'){
                    num++;
                }
                else cons++;
        }
        return vow>=1 && cons>=1;
    }
    public static void main(String[] args) {
        String word = "324a";
        System.out.println(isValid(word));
    }
}
