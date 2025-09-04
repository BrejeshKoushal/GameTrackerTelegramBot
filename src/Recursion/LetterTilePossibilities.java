package Recursion;

import java.util.Arrays;

public class LetterTilePossibilities {
    public void main(String[] args) {
        String st = "AAABBC";
        System.out.println(numTilePossibilities(st));
    }
    int count=0;
    public int numTilePossibilities(String tiles) {
        char[]ch = tiles.toCharArray();
        Boolean[] used = new Boolean[ch.length];
        Arrays.fill(used, false);
        Arrays.sort(ch);
        solve(ch,used);
        return count;
    }

    public void solve(char[] ch , Boolean[] used) {

        for (int i = 0; i < ch.length; i++) {
            if (used[i] || (i > 0 && ch[i] == ch[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            count++;
            solve(ch, used);
            used[i] = false;
        }
    }
}
