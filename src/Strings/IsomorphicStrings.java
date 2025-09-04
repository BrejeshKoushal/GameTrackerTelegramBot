package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public  void main(String[] args) {
        String s = "fot";
        String t = "baa";
        System.out.println(isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> characterMap = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0 ; i < s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!characterMap.containsKey(original)){
                if(!characterMap.containsKey(replacement)){
                    characterMap.put(original,replacement);
                }
                else return false;
            }
            else{
                if(characterMap.get(original)!=replacement){
                    System.out.println(characterMap.get(original));
                    return false;
                }
            }
        }
        return true;
    }
}
