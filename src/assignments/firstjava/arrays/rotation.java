package assignments.firstjava.arrays;

public class rotation {

    public static void main(String[] args) {
        int[][] arr = {{0, 1}
                ,      {1, 0}
        };
        int[][] target = {{1,0}
        ,                 {0,2}};
        System.out.println(findRotation(arr , target));
    }

    static boolean findRotation(int[][] matrix, int[][] target) {

        int rowsize = matrix.length;
        int columnsize = matrix[0].length;

        int[][] ans = new int[columnsize][rowsize];
        for(int i = 0 ; i  < matrix.length ;i++){
            for(int j = 0 ; j < matrix[i].length ;j++){

                ans[j][i] = matrix[i][j];


                if(ans[i][j]==target[i][j]){
                    return true;
                }

            }
        }
        return false;
    }


}

