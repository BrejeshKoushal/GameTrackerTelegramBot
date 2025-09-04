package StringCopy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public void main(String[] args) {
        String s = "baaaccd";
        System.out.println(frequencySort(s));
    }
    public String frequencySort(String s) {
        int[] arr = new int[128];
        for(int i = 0 ;i< s.length();i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        while(true) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            if(max==0) break;
            arr[index]=0;
        for(int i = 0;i<max;i++) {
            ans.append((char) index);
        }
        }
        return ans.toString();
    }
}
