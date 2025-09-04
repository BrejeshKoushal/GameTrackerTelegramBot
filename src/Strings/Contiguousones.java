package Strings;

public class Contiguousones {
    public  void main(String[] args) {
        String str = "1001";
        System.out.println(checkOnesSegment(str));
    }

    public boolean checkOnesSegment(String s) {
        int count=0;
        int i = 0;
        while(i<s.length()){
                if(s.charAt(i)=='1') {
                    count++;
                    while (i<s.length()&&s.charAt(i)== '1') i++;
                }
                else i++;
        }
        System.out.println(count);
        return count<=1;
    }
}