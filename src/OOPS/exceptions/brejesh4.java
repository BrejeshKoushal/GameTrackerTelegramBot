package OOPS.exceptions;

import java.util.Scanner;

class HrsException extends Exception{
    HrsException(String str) {
        super(str);
    }
}
class MinException extends Exception{
    MinException(String str) {
        super(str);
    }
}
class SecException extends Exception{
    SecException(String str) {
        super(str);
    }
}
class Time{
    int hours;
    int mins;
    int secs;

    public void Taketime() throws HrsException,MinException,SecException{
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        if(hours<0 || hours >60){
            throw new HrsException("Between 0 & 60 only");
        }
        mins = scanner.nextInt();
        if(mins<0 || mins >60){
            throw new MinException("Between 0 & 60 only");
        }
        secs = scanner.nextInt();
        if(secs<0 || secs >60){
            throw new SecException("Between 0 & 60 only");
        }
        System.out.println(STR."\{hours}:\{mins}:\{secs}");
    }
}
public class brejesh4 {
    public static void main(String[] args) {
        Time obj = new Time();
        try{
            obj.Taketime();
        }
        catch (HrsException | SecException | MinException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
