package Patterns;

public class Pattern_19 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		int space = 2*n-2;
		for(int i = 1;i<=2*n-1;i++){
			int stars=i;
			if(i>n) stars = 2*n-i;
//			stars
			for(int j = 1;j<=stars;j++){
				System.out.print("*");
			}
//				space
          for(int k = 1;k<=space;k++){
			  System.out.print(" ");
		  }
//				stars
			for(int l = 1;l<=stars;l++){
				System.out.print("*");
			}
			System.out.print("\n");
			if(i<n) space-=2;
			else space+=2;

		}
	}
}
