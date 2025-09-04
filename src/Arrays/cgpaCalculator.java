package Arrays;

import java.util.Scanner;

public class cgpaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int totalCredits = 0;
        int points = 0;
        double cgpa;
        System.out.println("Enter all the subject names separated by a space & write 's' when you are done:");        StringBuilder builder = new StringBuilder();
        while(true){
            String s = scanner.next();
            s=s.toLowerCase();
            if(s.equals("s")){
                break;
            }
            else{
                builder.append(s).append(" ");
            }
        }
        String[] subjects = builder.toString().trim().split(" ");
        while(true){
            System.out.println("Write 'm' if you wish to enter marks and enter 'g' if you wish to enter grade and 'c' if you wish to calculate.");
            String option = scanner.next();
            System.out.println(STR."Enter the credit of the \{subjects[i++]}");
            int credit = scanner.nextInt();
            totalCredits+=credit;
            if(option.equals("m")){
                System.out.println("Enter the marks you have obtained.");
                double marks = scanner.nextDouble();
                if(marks>=90){
                    points+=10;
                }
                else if(marks<90 && marks>=80){
                    points+=9;
                }
                else if(marks<80 && marks>=70){
                    points+=8;
                }
                else if(marks<70&&marks>=60){
                    points+=7;
                }
                else if(marks<60&&marks>=50) points+=6;
                else points+=5;
            }
            else if(option.equals("g")){
                System.out.println("Enter the grade you have obtained.");
                String grade = scanner.next();
                grade = grade.toUpperCase();
                if(grade.equals("O") ){
                    points+=10;
                }
                else if(grade.equals("E")){
                    points+=9;
                }
                else if(grade.equals("A")){
                    points+=8;
                }
                else if(grade.equals("B")){
                    points+=7;
                }
                else if(grade.equals("C")){
                    points+=6;
                }
                else points+=5;
            }
            else if(option.equals("c")){
                cgpa = (double) points /totalCredits;
                System.out.println(cgpa);
                break;
            }
        }
    }
}
