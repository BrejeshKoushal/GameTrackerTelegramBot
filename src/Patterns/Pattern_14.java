package Patterns;

public class Pattern_14 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		for(int i = 0 ;i<n;i++){
			char ch = 'A';
			for(int j = n;j>i;j--){
				System.out.print(ch);
			ch++;
			}
			System.out.println(" ");
		}
	}
}
