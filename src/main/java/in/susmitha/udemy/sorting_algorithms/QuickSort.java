package in.susmitha.udemy.sorting_algorithms;

public class QuickSort {
        public static void main(String[] args) {
            int[] arr1 = {50,85,69,44,92,81,25};

            quickSort(arr1 , 0 , arr1.length);

            for (int i=0 ; i < arr1.length ; i++){
                System.out.println(arr1[i]);
            }
        }
        public static void quickSort(int[] input , int start , int end){
            if(end - start < 2){
                return;
            }

            int pivotIndex = partition(input , start ,end);
            quickSort(input , start , pivotIndex);
            quickSort(input , pivotIndex+1 ,end );
        }

        public static int partition(int[] input , int start , int end){
            int pivot = input[start];
            int i = start;
            int j = end;

            while(i < j){
                while(i<j && input[--j] >= pivot);
                if(i<j) {
                    input[i] = input[j];
                }

                while (i < j && input[++i] <= pivot);
                if(i<j){
                    input[j] = input[i];
                }
            }
            input[j] = pivot;
            return j;
        }
    }

