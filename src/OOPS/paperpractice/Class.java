package OOPS.paperpractice;

interface volume{
    double PI = 3.14;
    double cal_vol();
}
class cylinder implements volume{
    double radius;
    double height;
    cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    public double cal_vol(){
        return PI*radius*radius*height;
    }
}
class cone implements volume{
    double radius,height;
    cone(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    public  double cal_vol(){
        return (PI*radius*radius*height)/3;
    }
}
public class Class {
    public static void main(String[] args) {
        cylinder cy = new cylinder(10,10);
        cone c = new cone(10,10);
        System.out.println(cy.cal_vol());
        System.out.println(c.cal_vol());
    }
}
