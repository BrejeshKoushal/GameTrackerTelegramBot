package Functions;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        function(1,2,3,3,4,3,3,2,3,4,4);
        Mult(1,23,"Brejesh" , "Koushal");
    }
    static void function(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void Mult(int a ,int b , String...v){

    }
}
