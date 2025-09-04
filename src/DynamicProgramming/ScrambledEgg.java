package DynamicProgramming;

import java.util.HashMap;

public class ScrambledEgg {
        static HashMap<String,Boolean> map = new HashMap<>();
        public static  boolean isScramble(String s1, String s2) {
            if (s1.equals(s2)) return true;
            if (s1.length()!=s2.length()) return false;
            if (s1.length()<=1) return false;
            String key = s1+""+s2;
            if (map.containsKey(key)){
                return map.get(key);
            }
            int n = s1.length();
            boolean isScrambled = false;
            for(int i =1 ;i<=n-1;i++){
                if (caseA(s1,s2,i) || caseB(s1,s2,i)){
                    isScrambled = true;
                    break;
                }
            }
            map.put(key,isScrambled);
            return isScrambled;
        }
        public static boolean caseA(String s1 , String s2 , int i){
            int n = s1.length();
            return isScramble(s1.substring(0, i), s2.substring(n - i, n)) &&
                    isScramble(s1.substring(i, n), s2.substring(0, n - i));
        }
        public static boolean caseB(String s1 , String s2 , int i){
            int n = s1.length();
            return isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                    isScramble(s1.substring(i, n), s2.substring(i, n));
        }

    public static void main(String[] args) {
        String s1 = "ballu", s2 = "ublau";
        System.out.println(isScramble(s1,s2));
    }
}
