package GraphsKiPractice;

import java.util.*;

public class AlienDict {
        public static List<Integer> topoSort(List<List<Integer>> list, Set<Integer> present){
            int V = list.size();
            List<Integer> res = new ArrayList<>();
            Queue<Integer> q  = new LinkedList<>();
            int[] inDegree = new int[V];
            for (List<Integer> integers : list) {
                for (int j : integers) {
                    inDegree[j]++;
                }
            }
            for (int i = 0 ; i < V ; i++ ){
                if (inDegree[i]==0) q.add(i);
            }
            while (!q.isEmpty()){
                int node = q.remove();
                res.add(node);
                for (int i : list.get(node)){
                    inDegree[i]--;
                    if (inDegree[i]==0 && present.contains(i)){
                        q.add(i);
                    }
                }
            }
            return res;
        }
        public static String findOrder(String[] words) {
            // code here
            List<List<Integer>> list= new ArrayList<>();
            int max = 0;
            Set<Integer> pre = new HashSet<>();
            for (String word : words) {
                for (char ch : word.toCharArray()) {
                    max = Math.max(max,ch-'a' + 1);
                    pre.add(ch-'a');
                }
            }


            for (int i = 0 ; i < max;i++)
            {
                list.add(new ArrayList<>());
            }
                for (int i = 0 ; i < words.length-1 ; i++){
                String s1 = words[i];
                String s2 = words[i+1];
                int len = Math.min(s1.length(),s2.length());

                for( int k = 0 ;k < len ; k++){
                    if(s1.charAt(k)!=s2.charAt(k)){
                        list.get(s1.charAt(k)-'a').add(s2.charAt(k)-'a');
                        break;
                    }
                }
            }
                List<Integer> ls = topoSort(list,pre);
                String st = "";
                for (int it : ls){
                    st = st +  (char) (it+'a');
                }

                return st;

        }
    public static void main(String[] args){
        String[] words = {"baa", "abcd", "abca", "cab", "cad"};
        System.out.println(findOrder(words));
    }
}
