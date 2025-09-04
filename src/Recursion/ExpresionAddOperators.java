package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ExpresionAddOperators {
    public void main(String[] args) {
        String num = "232";
        System.out.println(addOperators(num,4));
    }
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(num,target,0,ans,0,"",0);
        return ans;
    }
    public void solve(String num , int target , int index , List<String> ans , long sum,String list,long prev){

        if(index==num.length()){
            if(target==sum){
                ans.add(list);
            }
            return;
        }
       for(int i = index ; i<num.length();i++){
           if(i!=index&&num.charAt(index)=='0') break;
           long val = Long.parseLong(num.substring(index,i+1));
           if(index==0){
               solve(num,target,i+1,ans,val,String.valueOf(val),val);
           }
           else{
               solve(num,target,i+1,ans,sum-val, list+"-"+val,-val);
               solve(num,target,i+1,ans,sum+val,list+"+"+val,+val);
               solve(num,target,i+1,ans,(sum-prev)+(prev*val),list+"*"+val,prev*val);
           }
       }

    }
}
