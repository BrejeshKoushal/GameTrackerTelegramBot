package OOPS.Interface;
interface haha{
    double earnings();
    double deductions();
    static double bonus(){
return 0;
    };
}
class Manager implements haha{
double salary;
Manager(double salary){
    this.salary=salary;
}
    @Override
    public double earnings() {
        return salary+0.8*salary+0.15*salary;
    }
    @Override
    public double deductions(){
    return 0.12*salary;
    }
}
class Substaff extends Manager{

    Substaff(double salary) {
        super(salary);
    }
    public double bonus(){
        return 0.5*salary;
   }
}
public class nokriwokri {
    public static void main(String[] args) {
        haha obj = new Substaff(50000);
        System.out.println(obj.earnings());
        System.out.println(obj.deductions());
        Substaff obj2 = new Substaff(50000);
        System.out.println(obj2.bonus());
    }
}
