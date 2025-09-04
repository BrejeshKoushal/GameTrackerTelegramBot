package practiceproblems;

import java.util.Scanner;

public class Maxofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        for(int i = S ; i<=E ;i+=W){
            int cel = ((i-32)*5)/9;
            if(cel>0){
                cel = (int) Math.floor(cel);
            }
            else {
                cel = (int) Math.ceil(cel);
            }
            System.out.println(i+"\t"+cel);

        }
    }
}
