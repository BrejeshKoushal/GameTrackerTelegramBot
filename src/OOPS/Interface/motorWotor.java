package OOPS.Interface;

import java.util.Scanner;

interface Motor {
    int capacity = 10;

    void run();
    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("running");
    }

    @Override
    public void consume() {
        System.out.println("consuming");
    }

    public int getCapacity() {
        return capacity;
    }
}

public class motorWotor {
    public static void main(String[] args) {
        WashingMachine motor = new WashingMachine();
        motor.run();
        motor.consume();
        System.out.println("Capacity of the motor is " + motor.getCapacity());
    }
}
