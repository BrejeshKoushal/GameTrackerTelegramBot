package OOPS.inheritance;

import java.util.Scanner;

class box{
double length;
double breadth;
double height;

double volume(double length , double breadth , double height){
    return length*breadth*height;
}


}
public class volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double len = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double height = scanner.nextDouble();
        box obj = new box();
        System.out.println(obj.volume(len,breadth,height));
    }



}
