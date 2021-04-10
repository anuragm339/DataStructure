package arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int indexOne = 0;
        int indexTwo = 0;
        int smallestValue = Integer.MAX_VALUE;
        int currentValue;
        int[] smallestPair = new int[2];
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int firstOne = arrayOne[indexOne];
            int secondOne = arrayTwo[indexTwo];
            if (firstOne < secondOne) {
                currentValue = firstOne - secondOne;
                indexOne++;
            } else if (secondOne < firstOne) {
                currentValue = firstOne - secondOne;
                indexTwo++;
            } else {
                return new int[]{firstOne, secondOne};
            }
            if (Math.abs(smallestValue) > Math.abs(currentValue)) {
                smallestValue = currentValue;
                smallestPair = new int[]{firstOne, secondOne};
            }

        }
        return smallestPair;
    }
}
