package practiceproblems;
class Rectangle{
    double length;
    double breadth;
    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length*breadth;
    }
}
public class constoverloading {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        System.out.println(obj.area());
        Rectangle obj1 = new Rectangle(10, 20);
        System.out.println(obj1.area());
    }
}
