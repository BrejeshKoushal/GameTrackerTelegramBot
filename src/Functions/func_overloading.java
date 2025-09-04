package Functions;

public class func_overloading {
    public static void main(String[] args) {
fun(32);
fun("Brejesh");
    }
//    two or more func with same name can exist but with diff parameters

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.print(b);
    }

}
