package OOPS.sessional_;
abstract class Student {
    int roll;
    String name;
    Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }
    abstract void mark();
}
class CIA extends Student{
    CIA(int roll , String name){
        super(roll,name);
    }
    void mark(){
        System.out.println("Inside CIA");
    }
    void display(){
        System.out.println(STR."\{roll}\{name}");
    }
}
class Semester extends Student{
    Semester(int roll , String name){
        super(roll ,name);
    }
    void mark(){
        System.out.println("Inside semester");
    }
}
public class brejesh2 {
    public static void main(String[] args) {
        Student obj = new CIA(24,"Brejesh");
        obj.mark();
        Student obj2 =new Semester(25,"Aman");
        obj2.mark();
    }
}
