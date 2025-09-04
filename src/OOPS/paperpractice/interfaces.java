package OOPS.paperpractice;

import practiceproblems.Man;

interface employee{
    public void getdetails();
}
interface Manager extends employee{
   public void getDeptdetails();
}

class Head implements Manager{
    String empId;
    private String empName;
    private String deptId;
    private String deptName;
    Head(String empId,String empName,String deptId , String deptName){
        this.empId=empId;
        this.empName=empName;
        this.deptId=deptId;
        this.deptName=deptName;}
public void getdetails(){
    System.out.println(empId+" "+ empName);
}
public void getDeptdetails(){
    System.out.println(deptId+" "+deptName);
}

}
public class interfaces{
    public static void main(String[] args) {
Head head = new Head("101","Brejesh","234","CSE");
head.getdetails();
head.getDeptdetails();
    }
}
