package Arrays;

public class TotalSalary {
    public static void main(String[] args) {
        System.out.println(totalSalary(4567,'B'));
    }
    public static int totalSalary(int basic, char grade) {
        //Write your code here
        int allowance = 0;
        if(grade=='A'){
            allowance = 1700;
        }
        else if (grade=='B'){
            allowance = 1500;
        }
        else allowance = 1300;

        double sal = basic + (0.2*basic) + (0.5*basic) + allowance - (0.11*basic);
        return (int) Math.round(sal);
    }
}
