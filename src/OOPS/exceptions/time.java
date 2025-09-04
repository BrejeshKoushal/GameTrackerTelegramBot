package OOPS.exceptions;

import java.util.Scanner;

class HrsExc extends Exception{
    HrsExc(String string){
        super(string);
    }
}
class MinExc extends Exception{
    MinExc(String string){
        super(string);
    }
}
class SecExc extends Exception{
    SecExc(String string){
        super(string);
    }
}
 class Brejesh {
    private double hours;
    private double minutes;
    private double seconds;

    public void taketime() throws HrsExc,MinExc,SecExc{
        Scanner scanner = new Scanner(System.in);
        hours= scanner.nextDouble();
        if(hours<0||hours>24){
            throw new HrsExc("Hours b/w 0 and 24 only");
        }
        minutes = scanner.nextDouble();
        if(minutes<0||minutes>60){
            throw new MinExc("Mins error");
        }
        seconds = scanner.nextDouble();
        if(seconds<0||seconds>60){
            throw new SecExc("Sec error");
        }
    }




    }
public class time{
    public static void main(String[] args){
        Brejesh bre = new Brejesh();
        try{
            bre.taketime();
        }
        catch(HrsExc|MinExc|SecExc e){
            System.out.println(e.getMessage());
        }
    }
}



