import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = rndmGen(10, 1, 100); // Generates an array of 10 random integers between 1 and 100
        System.out.println("Array before bubble sort: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after bubble sort: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        int n = array.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap the elements if they are in the wrong order
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static int[] rndmGen(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}