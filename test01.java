/*Q1. max sum submatrix [given an m x n matrix may contains neg numbers , find the max sum among all possible sub matrices]
i/p:
4 5
1 2 -1 -4 5
-8 -3 4 2 1
3 8 10 1 -2
-4 -11 7 4 3
op:
Maximum Sub Submatrix = 29
q2. given m x n integer matrix can have neg count num of contiguous sub matrices 
q3. given a binary matrix 0 1 find area of very largest square.
q4. given n and n x n matrix A, compute A^k{k non neg integer} modulo MOD. use fast exponentiation (log k) wth O(n^3 log k) time complexity.
i/p: 2 5 1000000007
11
10
Interpretation: n=2, k=5, MOD=1000000007 , then matrix rows.
o/p:
Result: 
8 5
5 3
q5 min path sum with obstacles & teleporters
you have m x n grid with non neg costs, some sells are obstacles(-1) impassable. additionally a list of teleport pairs exists(from cell A to B with zero extra cost). find min cost from top-left (0,0 ) to bottomo right(m-1,n-1) allowing 4 directional moves (up, down, left, right). Use dijkstra on graph of cells.

*/
//Question 1 solution:
import java.util.Scanner;
class test01 {

    public int findMaxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                int currentMax = kadane(temp);

                if (currentMax > maxSum) {
                    maxSum = currentMax;
                }
            }
        }
        return maxSum;
    }

    private int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        test01 solution = new test01();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        /*int[][] matrix = {
            {1, 2, -1, -4, 5},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, -2},
            {-4, -1, 1, 7, -3}
        };*/

        int maxSum = solution.findMaxSum(matrix);
        System.out.println("The maximum sum of a submatrix is: " + maxSum);
        // Expected output: The maximum sum of a submatrix is: 29
    }
}