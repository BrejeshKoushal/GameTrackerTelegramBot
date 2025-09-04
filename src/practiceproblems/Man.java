package practiceproblems;

interface Motor{
    double capacity=100;
    public void run();
    public void consume();

}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("Running");
    }
    public void consume(){
        System.out.println("Consuming");
    }
}
public class Man {
    public static void main(String[] args) {
        Motor obj = new WashingMachine();
        obj.run();
        obj.consume();
        System.out.println(Motor.capacity);
    }
}
