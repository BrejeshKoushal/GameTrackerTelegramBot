package OOPS.paperpractice;
class Apple{
        void show(){
            System.out.println("Inside apple");
        }
}
class banana extends Apple{
    void show(){
        System.out.println("Inside banana");
    }
}

class cherry extends Apple{
    void show(){
        System.out.println("Inside cherry");
    }
}
public class lab {
    public static void main(String[] args) {
Apple app = new Apple();
app.show();
Apple app2 = new banana();
app2.show();
Apple aap3 = new cherry();
aap3.show();
    }
}
