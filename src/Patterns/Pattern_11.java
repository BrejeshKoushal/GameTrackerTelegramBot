package Patterns;

public class Pattern_11 {
	public static void main(String[] args) {
		// Your code here
		pattern(4);
	}
	public static void pattern(int n){
		for(int i = 1; i<=n;i++){
			for(int j = 1 ;j<=i;j++){
				System.out.print(j);
			}
			for(int k = 1 ; k<(2*n)-(2*i);k++){
				System.out.print(" ");
			}
			for(int l = 1 ; l<=i;l++){
				System.out.print(l);
			}
			System.out.println(" ");
		}

	}
}
