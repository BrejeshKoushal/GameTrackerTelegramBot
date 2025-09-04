package Recursion;

public class printNto1 {
    public  void main(String[] args) {
        int N = 10;
        printNos(N);
    }
    void printNos(int N) {
        // code here
        if(N<1) return;
        System.out.print(N+" ");
        N--;
        printNos(N);

    }
}
