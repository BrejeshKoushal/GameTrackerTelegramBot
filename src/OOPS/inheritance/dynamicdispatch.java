package OOPS.inheritance;
class Apple{
    void show(){
        System.out.println("I am an apple");
    }
}
class banana extends Apple{
    void show(){
        System.out.println("I am banana");
    }
}
class Cherry extends Apple{
    void show(){
        System.out.println("I am cherry");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        Apple app = new Apple();
        app.show();
        Apple app2 = new banana();
        app2.show();
        Apple app3 = new Cherry();
        app3.show();
    }
}
