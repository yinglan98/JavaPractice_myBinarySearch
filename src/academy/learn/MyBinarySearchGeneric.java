package academy.learn;

import java.util.List;

public class MyBinarySearchGeneric {
    public static <T extends Comparable> int binarySearch(List<T> orderedListToBeSearched, T target) {
        int leftIndex = 0;
        int rightIndex = orderedListToBeSearched.size() - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (target.compareTo(orderedListToBeSearched.get(midIndex)) < 0) {
                rightIndex = midIndex - 1;
            } else if (target.compareTo(orderedListToBeSearched.get(midIndex)) > 0) {
                leftIndex = midIndex + 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
