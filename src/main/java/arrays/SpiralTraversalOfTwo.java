package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfTwo {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> intList = new ArrayList<>();
        int endRow = array.length - 1;
        int endColumn = array[0].length - 1;
        int startRow = 0;
        int startColumn = 0;
        sprialFill(array, startRow, endRow, startColumn, endColumn, intList);
        System.out.println(intList);
        return intList;
    }

    private static void sprialFill(int[][] array, int startRow, int endRow, int startCol, int endCol, List<Integer> intList) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }
        for (int col = startCol; col <= endCol; col++) {
            intList.add(array[startRow][col]);
        }
        for (int row = startRow + 1; row <= endRow; row++) {
            intList.add(array[row][endCol]);
        }
        for (int col = endCol - 1; col >= startCol; col--) {
            if (startRow == endRow) break;
            intList.add(array[endRow][col]);
        }
        for (int row = endRow - 1; row >= startRow + 1; row--) {
            if (startCol == endCol) break;
            intList.add(array[row][startCol]);
        }
        sprialFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, intList);

    }

}
