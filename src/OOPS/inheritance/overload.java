package OOPS.inheritance;

import java.util.Scanner;

class AreaCalculator{

    public double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    public double area(double base,double height){
        return 0.5*base*height;
    }
    public double area(float side){
        return side*side;
    }
}
public class overload{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = scanner.nextDouble();
        double height = scanner.nextDouble();
        float side = scanner.nextByte();
        AreaCalculator obj = new AreaCalculator();
        System.out.println(obj.area(radius));
        System.out.println(obj.area(area,height));
        System.out.println(obj.area(side));
    }
}


