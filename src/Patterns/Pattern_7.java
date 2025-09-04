package Patterns;

public class Pattern_7 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {
//		space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

//		star
			for(int k = 0 ;k<2*n-(2*i+1);k++){
				System.out.print("*");
			}
//		space
			for(int  l = 0;l<i;l++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}
}}
