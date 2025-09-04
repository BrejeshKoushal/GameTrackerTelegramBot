package SlidingWindowAndTwoPointers;

public class NumberOfSubstringContainingAllChars {
    public static void main(String[] args) {
        String s = "aaacb";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s){
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        while(j<s.length()){
            if(s.charAt(j)=='a') a++;
            if(s.charAt(j)=='b') b++;
            if(s.charAt(j)=='c') c++;
            while(a!=0&&b!=0&&c!=0){
                if(s.charAt(i)=='a') a--;
                if(s.charAt(i)=='b') b--;
                if(s.charAt(i)=='c') c--;
                i++;
                sum+=s.length()-j;
            }
            j++;
        }
        return sum;
    }
}
