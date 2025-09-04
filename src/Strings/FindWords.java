package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String s = String.valueOf(x);
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < words.length;i++){
            if(words[i].contains(s)){
                list.add(i);
            }
        }
        return list;
    }

    public void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        List<Integer> list = findWordsContaining(words, 'a');
        System.out.println(list);
    }
}
