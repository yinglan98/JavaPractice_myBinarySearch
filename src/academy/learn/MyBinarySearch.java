package academy.learn;

import java.util.List;

public class MyBinarySearch {
    public static int binarySearch(List<Integer> orderedListToBeSearched, Integer target) {
        int leftIndex = 0;
        int rightIndex = orderedListToBeSearched.size() - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (target < orderedListToBeSearched.get(midIndex)) {
                rightIndex = midIndex - 1;
            } else if (target > orderedListToBeSearched.get(midIndex)) {
                leftIndex = midIndex + 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
