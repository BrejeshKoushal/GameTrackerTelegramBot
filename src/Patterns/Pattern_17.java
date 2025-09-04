package Patterns;

public class Pattern_17 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}
	public static void pattern(int n){
		for(int i = 0 ; i<n;i++){
			for(char j = (char) ('E'-i); j<='E'; j++){
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
