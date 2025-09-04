package OOPS.exceptions;

public class brejesh2 {

    public static void main(String[] args) {
        try{
            int a = 10;
            int b  = 0;
            int c = a/b;
            System.out.println(c);

    }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute");
        }
        }

}
