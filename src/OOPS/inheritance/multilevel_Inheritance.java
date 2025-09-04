package OOPS.inheritance;
class plate {
    double length;
    double width;

    plate(double length , double width){
        this.length = length;
        this.width = width;
    }
    void display(){
        System.out.println(STR."\{length}\{width}");
    }
}

class boxx extends plate{
    double height;
    boxx(double height ,double length , double width){
        super(width,length);
        this.height=height;
    }
void display(){
    System.out.println(STR."\{length}\{width}\{height}");
}
}
class woodbox extends boxx{
    double thick;
    woodbox(double thick , double length , double height , double width){
        super(height,length,width);
        this.thick=thick;
    }
    void display(){
        System.out.println(STR."\{length}\{width}\{height}\{thick}");
    }
}
public class multilevel_Inheritance {
    public static void main(String[] args) {
        plate pl = new plate(1,2);
        boxx box = new boxx(3,4,5);
        woodbox wood = new woodbox(7,8,9,10);
        pl.display();
        box.display();
        wood.display();
    }
}
