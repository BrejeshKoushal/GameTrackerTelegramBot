package SlidingWindowAndTwoPointers;

public class CardPoints {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,1};
        System.out.println(maxScore(arr,3));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int maxSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i < k; i++){
            leftSum+=cardPoints[i];
            maxSum = leftSum;
        }
        int j = cardPoints.length-1;
        for(int i = k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[j];
            j--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }

}
