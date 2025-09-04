package OOPS.paperpractice;

import java.util.Scanner;

class hrs extends Exception{
    hrs(String string){
        super(string);
    }
}
class min extends Exception{
    min(String string){
        super(string);
    }
}
class sec extends Exception{
    sec(String string){
        super(string);
    }
}
class Time{
    int hours,minutes,seconds;
    void taketime() throws hrs,min,sec{
        Scanner scanner = new Scanner(System.in);

            hours = scanner.nextInt();
            if(hours<0||hours>24){
                throw new hrs("galat");
            }
        minutes = scanner.nextInt();
        if(minutes<0||minutes>60){
            throw new min("galat");
        }
        seconds = scanner.nextInt();
        if(seconds<0||seconds>60){
            throw new sec("galat");
        }
    }
}
public class hr {
    public static void main(String[] args) {
        Time t = new Time();
        try{
            t.taketime();
        }
        catch(hrs|min|sec e){
            System.out.println(e.getMessage());
        }
    }
}
