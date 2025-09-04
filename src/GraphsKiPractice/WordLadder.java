package GraphsKiPractice;

import java.util.*;

public class WordLadder {
    static class Pair{
        String word;
        int length;

        public Pair(String word, int length) {
            this.word = word;
            this.length = length;
        }
    }
    public static int wordLadderLength(String startWord, String targetWord,
                                       String[] wordList) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,wordList);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord,1));
        while(!q.isEmpty()){
            Pair pair = q.remove();
            String word = pair.word;
            int len = pair.length;
            if(word.equals(targetWord)) return len;
            for (int i = 0 ; i < word.length();i++){
                for (char ch = 'a' ; ch<='z' ; ch++){
                    char[] wordArr = word.toCharArray();
                    wordArr[i]=ch;
                    String str = new String(wordArr);
                    if (set.contains(str)){
                        set.remove(str);
                        q.add(new Pair(str,len+1));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"hot","dot","dog","lot","log","cog"};
        System.out.println(wordLadderLength(beginWord,endWord,wordList));
    }
}
