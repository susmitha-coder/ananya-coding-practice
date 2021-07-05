package in.susmitha.udemy.sorting_algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        int[] arr = {50, 75, 22, 45, 11, 9, 45};
        selection.selectionSort(arr);
    }

    public void selectionSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            int large = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[large]) {
                    large = j;
                }
            }
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}