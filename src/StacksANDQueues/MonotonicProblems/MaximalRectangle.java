package StacksANDQueues.MonotonicProblems;

import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char[][]arr = {{'1','0','1','0','0'},
                      {'1','0','1','1','1'},
                      {'1','1','1','1','1'},
                      {'1','0','0','1','0'}};
        System.out.println(maximalRectangle(arr));

    }
    public static int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]height = new int[m][n];
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int  j = 0 ; j < m ; j++){
                sum+=matrix[j][i] - '0';
                if(matrix[j][i]=='0') sum=0;
                height[j][i] = sum;
            }
        }
        int max = 0;
        for(int i = 0 ; i < m ; i++){
            max = Math.max(max,largestRectangle(height[i]));
        }
        printMatrix(height);
        return max;
    }
    public static int largestRectangle(int[]arr){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i = 0 ; i <= arr.length;i++){
            while(!st.isEmpty()&&( i==arr.length || arr[st.peek()]>arr[i])){
                int height = arr[st.peek()];
                int width;
                st.pop();
                if(st.isEmpty()) width = i;
                else{
                    width = i - st.peek() -1;
                }
                max = Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;

    }


    public static void printMatrix(int[][]arr){
        for (int[] ins : arr) {
            for (int anInt : ins) {
                System.out.print(STR."\{anInt} ");
            }
            System.out.println();
        }
    }
    }

