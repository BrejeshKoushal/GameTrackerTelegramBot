package OOPS.paperpractice;
class A{
    int age;
    public void config(){
        System.out.println("In config");
    }
    static class B{
        public void show(){
            System.out.println("In show");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        A a = new A();
        a.config();
        A.B b = new A.B();
        b.show();
    }

}
