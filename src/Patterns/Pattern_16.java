package Patterns;

public class Pattern_16 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n ){
		for(int  i = 1;i<=n;i++){
//			space
			char ch = 'A';
			for(int j = 0;j<n-i;j++){
				System.out.print(" ");
			}

//			characters
			int breakpoint = (2*i)/2;
			for(int k = 1;k<=2*i-1;k++){
				System.out.print(ch);
			if(k<breakpoint) ch++;
			else ch--;
			}


//			space
			for(int l = 0 ; l<n-i;l++){
				System.out.print(" ");
			}
			System.out.println(" ");

		}
	}
}
