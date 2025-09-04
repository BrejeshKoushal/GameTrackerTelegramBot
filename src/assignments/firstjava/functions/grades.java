package assignments.firstjava.functions;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float marks = scanner.nextByte();
        grade(marks);
    }

    static void grade(float marks) {
        if (marks <= 100) {

            if (marks > 91) {
                System.out.println("AA");
            }
            if (marks > 81 && marks < 90) {
                System.out.println("AB");
            }
            if (marks > 71 && marks < 80) {
                System.out.println("BB");
            }
            if (marks > 61 && marks < 70) {
                System.out.println("BC");
            }
            if (marks > 51 && marks < 60) {
                System.out.println("CD");
            }
            if (marks > 41 && marks < 50) {
                System.out.println("DD");
            }
            if (marks <= 40) {
                System.out.println("Fail");
            }
        }
    }}
