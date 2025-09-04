package Practice;

public class MinOccurence {
    public static char count(String s) {
        int[] freq = new int[256];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            freq[idx]++;
        }
        int firstBig = Integer.MAX_VALUE;
        char c = 'a';
        for (int i = 0 ; i < 256 ; i++){
            if (freq[i]!=0 && freq[i]<firstBig){
                firstBig = freq[i];
                c = (char) i;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String st = "cdadcda";
        System.out.println(count(st));
    }
}
