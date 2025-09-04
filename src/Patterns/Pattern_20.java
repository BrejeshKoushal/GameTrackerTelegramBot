package Patterns;

public class Pattern_20 {
	public static void main(String[] args) {
		// Your code here
		pattern(4);
	}
	public static void pattern(int n){
		for(int i =1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				if(i==1||j==1|i==n||j==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
