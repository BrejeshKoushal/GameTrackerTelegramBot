package Recursion;

import java.util.ArrayList;

public class GrayCode {
    public  void main(String[] args) {
        System.out.println(graycode(3));
    }
    public ArrayList<String> graycode(int n)
    {
        //code here
        ArrayList<String> list = new ArrayList<>();
        if(n==1){
            list.add("0");
            list.add("1");
            return list;
        }
        ArrayList<String> recursiveList = graycode(n-1);
        ArrayList<String>  ans = new ArrayList<>();
        for(int i = 0;i<recursiveList.size();i++){
           ans.add("0"+recursiveList.get(i));
        }
        for(int i = recursiveList.size()-1;i>=0;i--){
            ans.add("1"+recursiveList.get(i));
        }
        return ans;
    }
}