package Patterns;

public class Pattern_10 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		for(int i = 1 ; i <= n ;i++){
			int start=1;
			if(i%2==0){
				start=0;
			}
			for(int j = 1 ;j<=i ;j++){
				System.out.print(start);
			start = 1-start;
			}
			System.out.println(" ");

		}
		System.out.println("\n");
	}
}
