import java.util.Random;

public class SortedArray {

    public static final int arr[] = new int[10];

    public static int[] createArray() {
        Random rnd = new Random();
        System.out.println("Array generated:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(20);
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        return arr;
    }

    public static int[] sort(){
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i){
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        return arr;
    }

}
