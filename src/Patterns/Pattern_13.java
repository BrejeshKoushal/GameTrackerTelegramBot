package Patterns;

public class Pattern_13 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		for(int i = 1;i<=n;i++){
			char ch = 'A';
			for(int j = 1;j<=i;j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println(" ");
		}
	}
}
