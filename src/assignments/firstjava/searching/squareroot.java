package assignments.firstjava.searching;

import java.util.Scanner;

public class squareroot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(mySqrt(a));
    }



    static int mySqrt(int x) {
        int start = 1;
        if(x==0){
            return 0;
        }
        int end = x;
        while(start<= end){
            int mid = start + (end -start)/2;
            if(mid==x/mid)
                return mid;
            else if(mid>x/mid){
                end=mid-1;
            }
            else{
                start = mid + 1;
            }

        }
        return start;
    }

}
