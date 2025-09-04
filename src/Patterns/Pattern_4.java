package Patterns;

public class Pattern_4 {
	public static void main(String[] args) {
		// Your code here
		pattern(4);
	}
	public static void pattern(int n){
		for(int i = 0 ; i < n;i++){
			for(int j = i ; j<n ;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
