package SlidingWindowAndTwoPointers;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s,1));
    }
    public static int characterReplacement(String s, int k) {
        int maxFreq=0, maxLen=0, l=0, r=0;
        int[] hash=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,hash[s.charAt(r)-'A']);
            if((r-l+1-maxFreq)>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
