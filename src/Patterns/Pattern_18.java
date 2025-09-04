package Patterns;

public class Pattern_18 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n ){
		for(int i = 1;i<=n;i++){
//			star
			for(int j=1;j<=n-i+1;j++){
				System.out.print("*");
			}

//			space
			for(int k = 0;k<2*i-2;k++){
				System.out.print(" ");
			}

//			star
			for(int l=1;l<=n-i+1;l++){
				System.out.print("*");
			}
			System.out.println(" ");

		}
//		second portion
		for(int i = 1;i<=n;i++){
//			star
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

//			space
			for(int k = 0;k<2*n-2*i;k++){
				System.out.print(" ");
			}

//			star
			for(int l=1;l<=i;l++){
				System.out.print("*");
			}
			System.out.println(" ");

		}

	}
}
