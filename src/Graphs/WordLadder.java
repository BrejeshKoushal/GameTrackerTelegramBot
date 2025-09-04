package Graphs;

import java.util.*;

public class WordLadder {
    public static class Pair{
        String word;
        int length;

        public Pair(String word, int length) {
            this.word = word;
            this.length = length;
        }
    }
    public List<List<String>> ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> mainList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> set = new HashSet<String>(wordList);
        set.remove(beginWord);
        list.add(beginWord);
        while(!q.isEmpty()){
            String word = q.peek().word;
            int length = q.peek().length;
            q.remove();
            if (word.equals(endWord)) {
                mainList.add(new ArrayList<>(list));

            }
            for (int i = 0 ; i < word.length();i++){
                for (char ch = 'a' ; ch <= 'z' ; ch++){
                    char[] replacedArray = word.toCharArray();
                    replacedArray[i]=ch;
                    String replaceWord = new String(replacedArray);
                    if (set.contains(replaceWord)){
                        set.remove(replaceWord);
                        list.add(replaceWord);
                        q.add(new Pair(replaceWord,length+1));
                    }
                }
            }
        }
        return mainList;
    }

    public void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }
}
