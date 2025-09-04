package Patterns;

public class Pattern_3 {
    public static void main(String[] args) {
        patter(5);
    }
    public static void patter(int n){
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    }
}
