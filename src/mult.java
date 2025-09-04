import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        for(int i = 1 ; i <=n; i++){
            ans*=i;
        }
        System.out.println(ans);
    }
}
