package in.susmitha.udemy.sorting_algorithms;

public class BubbleSort {
    public static void main( String[] args ) {
        BubbleSort bubble = new BubbleSort();
        int[] arr = {54,5,78,8,24,89};
        bubble.bubbleSort(arr);
    }
    public int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){

            for(int j=0;j<i;j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
}
