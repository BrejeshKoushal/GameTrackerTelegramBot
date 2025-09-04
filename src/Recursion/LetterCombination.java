package Recursion;

import java.util.*;

public class LetterCombination {
    public void main(String[] args) {
        String st = "23";
        System.out.println(letterCombinations(st));
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        if(digits.isEmpty()) return list;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        recursion(list,new StringBuilder(),digits,0,map);
        return list;
    }
    public void recursion(ArrayList<String> res,StringBuilder st , String str, int index, Map<Character,String> map){
        if(index==str.length()){
            res.add(String.valueOf(st));
            return;
        }
        String letters = map.get(str.charAt(index));
        for(char letter : letters.toCharArray()){
            st.append(letter);
            recursion(res,st,str,index+1,map);
            st.deleteCharAt(st.length()-1);
        }
    }
}
