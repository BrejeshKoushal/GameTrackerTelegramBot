package OOPS.paperpractice;

class Rectangle{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double findarea(){
        return length*width;
    }

}
class Box extends Rectangle {
    double height;
    Box(double length , double width , double height){
        super(length, width);
        this.height=height;
    }
    double findvol(){
        return length*width*height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle obj1= new Rectangle(10,10);
        Box b1 = new Box(10,10,10);
        System.out.println(obj1.findarea());
        System.out.println(b1.findvol());
    }
}
