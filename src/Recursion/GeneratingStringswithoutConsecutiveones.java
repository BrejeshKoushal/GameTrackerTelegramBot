package Recursion;

import java.util.Arrays;

public class GeneratingStringswithoutConsecutiveones {
    public  void main(String[] args) {
    int k = 3;
    function(k);
    }
    void generate(int k,char[]ch,int i){
        if(i==k){
            System.out.println(STR."\{Arrays.toString(ch)} ");
            return;
        }
        if(ch[i-1]=='0'){
            ch[i]='0';
            generate(k,ch,i+1);
            ch[i]='1';
            generate(k,ch,i+1);
        }
        if(ch[i-1]=='1'){
            ch[i]='0';
            generate(k,ch,i+1);
        }
    }
    void function(int k){
        if(k<=0) return;
        char[] ch = new char[k];
        ch[0]='0';
        generate(k,ch,1);
        ch[0]='1';
        generate(k,ch,1);
    }

}
