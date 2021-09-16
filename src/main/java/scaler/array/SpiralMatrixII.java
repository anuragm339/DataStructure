package scaler.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {
    public List<List<Integer>> generateMatrix1(int A) {
        int[][] result = new int[A][A];
        int cnt = 1;
        int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int row = 0;
        int col = 0;
        while (cnt <= A * A) {
            result[row][col] = cnt++;
            int r = Math.floorMod(row + dir[d][0], A);
            int c = Math.floorMod(col + dir[d][1], A);
            if (result[r][c] != 0) {
                d = (d + 1) % 4;
            }
            row += dir[d][0];
            col += dir[d][1];
        }
        List<List<Integer>> finalList= new ArrayList<>();
        for(int i=0;i<result.length;i++){
            List<Integer> temp= new ArrayList<>();
            for(int j=0;j<result[i].length;j++){
                temp.add(result[i][j]);
            }
            finalList.add(temp);
        }
        return finalList;

    }
}
