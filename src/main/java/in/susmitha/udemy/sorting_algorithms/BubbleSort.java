package in.susmitha.udemy.sorting_algorithms;

public class BubbleSort {
    public static void main( String[] args ) {
        BubbleSort bubble = new BubbleSort();
        int[] arr1 = {90,35,39,42,52,69,25};
        bubble.bubbleSort(arr1);
    }
    public void bubbleSort(int[] arr1){
        for(int i=arr1.length-1;i>0;i--){

            for(int j=0;j<i;j++){

                if(arr1[j]>arr1[j+1]){

                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}

