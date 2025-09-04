package OOPS.exceptions;

import java.util.Scanner;

class hrsexception extends Exception{
    hrsexception(String string){
        super(string);
    }
}
class minexception extends Exception{
    minexception(String string){
        super(string);
    }
}
class secexception extends Exception{
    secexception(String string){
        super(string);
    }
}
class Times{
    int hours;
    int min;
    int sec;

    public void Taketime() throws hrsexception,minexception,secexception{
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        if(hours<0||hours>24){
            throw new hrsexception("Hours should  be between 0 and 24 only ");
        }
        int min = scanner.nextInt();
        if(min<0||min>60){
            throw new hrsexception("Mins should  be between 0 and 60 only ");
        }
        int sec = scanner.nextInt();
        if(sec<0||sec>60){
            throw new hrsexception("Secs should  be between 0 and 60 only ");
        }
        System.out.println(STR."\{hours}:\{min}:\{sec}");
    }

}
public class brejesh8 {
    public static void main(String[] args) {
        Times times = new Times();
        try{
            times.Taketime();
        }
        catch (hrsexception|minexception|secexception e){
            System.out.println(e.getMessage());
        }
    }
}
