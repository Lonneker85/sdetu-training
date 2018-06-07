package algorithms;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = {10, 255, 433, 236, 73, 132, 5};
        int[] sortedNumbers = {5, 9, 12, 18,21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};

        // Call the linear search function that searches for a specific number
        int pos = algorithms.Search.linearSearch(numbers, 26);
        System.out.println("Found at position: " + pos);

        // Call the binary search function
        int index = algorithms.Search.binarySearch(sortedNumbers, 91, 0, sortedNumbers.length -1);
        System.out.println("Found at position: " + index);

        // Call the bubble sort function
        Sort.bubbleSort(numbers);
    }

}
