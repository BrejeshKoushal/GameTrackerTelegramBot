package Recursion;

import java.util.*;

public class ReplaceWords {
    public void main(String[] args) {
        List<String> dic = new ArrayList<>();
        dic = List.of(new String[]{"cat", "bat", "rat"});
       String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dic,sentence));
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>(dictionary);
        String[] sen = sentence.split(" ");
        System.out.println(Arrays.toString(sen));
        StringBuilder ans = new StringBuilder();
        System.out.println(set);
        for(int i = 0 ; i<sen.length;i++){
            boolean found = false;
            String str = sen[i];
            for(int j = 0 ; j<str.length();j++){
                if(set.contains(str.substring(0,j+1))){
                    ans.append(str, 0, j+1);
                    found = true;
                    break;
                }
            }
            if(!found){
                ans.append(str);
            }
            if(i!=sen.length-1){
                ans.append(" ");
            }
        }



        return ans.toString();
    }
}
