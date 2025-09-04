package Recursion;

public class PrintNameNTimes {
    public void main(String[] args) {
        int N = 10;
        printGfg(N);
    }
    int count=1;
    void printGfg(int N) {
        // code here
        if(count>N) return;
        System.out.print("GFG"+" ");
        count++;
        printGfg(N);
    }
}
