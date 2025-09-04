package Patterns;

public class Pattern_5 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		for(int i = 0 ; i <n ;i++){
			for(int j = 0 ; j<n-i ;j++){
				System.out.print(j+1);
			}
			System.out.print("\n");
		}
	}
	}
