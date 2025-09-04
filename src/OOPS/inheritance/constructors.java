package OOPS.inheritance;
class Rectangless {
    double length;
    double breadth;
    Rectangless(){
        this.length=0;
        this.breadth=0;
    }
    Rectangless(double length , double breadth){
        this.length = length;
        this.breadth = breadth;

    }
    void display(){
        System.out.println(STR."length \{length} breadth:\{breadth}");
    }
    double area(){
        return length*breadth;
    }
}
public class constructors {
    public static void main(String[] args) {
        Rectangless rect = new Rectangless();
        rect.display();
        System.out.println(rect.area());
        Rectangless rect2 = new Rectangless(2,4);
        rect2.display();
        System.out.println(rect2.area());
    }
}
