package scaler.array;

public class SumofAllSubmatrices {
    /*
    Given a 2D Matrix A of dimensions N*N, we need to return sum of all possible submatrices.
    A = [ [1, 1]
      [1, 1] ]
      Example Output
    16
Example Explanation
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16
     */
    public int solve(int[][] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                sum+=A[i][j]*(i+1)*(A.length-i)*(j+1)*(A[i].length-1);
            }
        }
        return sum;
    }

}
