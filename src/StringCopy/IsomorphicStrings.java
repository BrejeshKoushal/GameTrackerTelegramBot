package StringCopy;

import java.util.HashMap;

public class IsomorphicStrings {
    public void main(String[] args) {
       String s = "paper", t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> map = new HashMap<>();
            for(int i = 0;i<s.length();i++){
               char original = s.charAt(i);
               char replace = t.charAt(i);
               if(!map.containsKey(original)){
                   if(!map.containsValue(replace)){
                       map.put(original,replace);
                   }
                   else return false;
                   System.out.println(map);
               }

               else{
                   if(map.get(original)!=replace){
                       return false;
                   }
               }
            }
            System.out.println(map);
            return true;
    }
}
