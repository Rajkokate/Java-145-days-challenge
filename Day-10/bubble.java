public class bubble {

    // function for sorting array
    public static void bubbleSortWithCount(int num[]) {
        int n = num.length;
        int swapCount = 0; // count for swap happened

        for (int turn = 0; turn < n - 1; turn++) {
            boolean swapped = false; // first swapp is false 

            for (int j = 0; j < n - 1 - turn; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;  // swap is happen then counted++
                    swapCount++;
                }
            }

            // If no swaps were made, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Number of swaps: " + swapCount);
    }

    // function for creating array
    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        bubbleSortWithCount(num);
        printArray(num);
    }
}
