package OOPS.paperpractice;

class brejesh{
    double real;
    double imag;
    brejesh(){
        this.real=0;
        this.imag=0;
    }
    brejesh(double real,double imag){
        this.real=real;
        this.imag=imag;

    }
    public brejesh add(brejesh a, brejesh b){
        double reali = a.real+b.real;
        double ima =  a.imag+ b.imag;
        return new brejesh(reali,ima);
    }

}
class ComplexNum{
    public static void main(String[] args) {
        brejesh obj = new brejesh();
        brejesh obj1 = new brejesh(3, 4);
        brejesh obj2 = new brejesh(5,   6);
        brejesh ans = obj.add(obj1,obj2);
        System.out.println(Integer.parseInt(ans.toString()));;

    }
}