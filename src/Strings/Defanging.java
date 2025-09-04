package Strings;

public class Defanging {
    public  void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    public String defangIPaddr(String address) {
       return address.replace(".","[.]");
    }
}
