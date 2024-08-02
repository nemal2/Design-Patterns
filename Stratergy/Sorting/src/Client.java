public class Client {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        Context sortingContext = new Context(new Bubble());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1); // Output: Sorting using Bubble Sort


        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new Quick());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3); // Output: Sorting using Quick Sort
    }
}
