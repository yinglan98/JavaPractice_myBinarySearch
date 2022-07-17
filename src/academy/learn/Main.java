package academy.learn;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Test myBinarySearch
        testMyBinarySearch();
        testMyBinarySearchGeneric();
    }

    public static void testMyBinarySearch() {
        // ArrayList
        ArrayList<Integer> arrayListOneElement = new ArrayList<>(Arrays.asList(1));
        assert(MyBinarySearch.binarySearch(arrayListOneElement, 1) == 0);
        assert(MyBinarySearch.binarySearch(arrayListOneElement, 0) == -1);

        ArrayList<Integer> arrayListTwoElements = new ArrayList<>(Arrays.asList(1,2));
        assert(MyBinarySearch.binarySearch(arrayListTwoElements, 1) == 0);
        assert(MyBinarySearch.binarySearch(arrayListTwoElements, 2) == 1);
        assert(MyBinarySearch.binarySearch(arrayListTwoElements, 3) == -1);

        // LinkedList
        LinkedList<Integer> linkedListThreeElements = new LinkedList<>(Arrays.asList(1,2,3,4));
        assert(MyBinarySearch.binarySearch(linkedListThreeElements, 1) == 0);
        assert(MyBinarySearch.binarySearch(linkedListThreeElements, 2) == 1);
        assert(MyBinarySearch.binarySearch(linkedListThreeElements, 3) == 2);
        assert(MyBinarySearch.binarySearch(linkedListThreeElements, 4) == 3);
        assert(MyBinarySearch.binarySearch(linkedListThreeElements, 5) == -1);
    }

    public static void testMyBinarySearchGeneric() {
        MyBinarySearchGeneric myBinarySearchGeneric = new MyBinarySearchGeneric();
        // ArrayList
        ArrayList<Integer> arrayListOneElement = new ArrayList<>(Arrays.asList(1));
        assert(myBinarySearchGeneric.binarySearch(arrayListOneElement, 1) == 0);
        assert(myBinarySearchGeneric.binarySearch(arrayListOneElement, 0) == -1);

        ArrayList<Integer> arrayListTwoElements = new ArrayList<>(Arrays.asList(1,2));
        assert(myBinarySearchGeneric.binarySearch(arrayListTwoElements, 1) == 0);
        assert(myBinarySearchGeneric.binarySearch(arrayListTwoElements, 2) == 1);
        assert(myBinarySearchGeneric.binarySearch(arrayListTwoElements, 3) == -1);

        // LinkedList
        LinkedList<Integer> linkedListThreeElements = new LinkedList<>(Arrays.asList(1,2,3,4));
        assert(myBinarySearchGeneric.binarySearch(linkedListThreeElements, 1) == 0);
        assert(myBinarySearchGeneric.binarySearch(linkedListThreeElements, 2) == 1);
        assert(myBinarySearchGeneric.binarySearch(linkedListThreeElements, 3) == 2);
        assert(myBinarySearchGeneric.binarySearch(linkedListThreeElements, 4) == 3);
        assert(myBinarySearchGeneric.binarySearch(linkedListThreeElements, 5) == -1);
    }
}
