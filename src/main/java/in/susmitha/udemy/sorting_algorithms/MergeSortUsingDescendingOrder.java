package in.susmitha.udemy.sorting_algorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MergeSortUsingDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {10,35,29,42,12,89,45};

        mergeSort(arr , 0 , arr.length);

        for(int i=0;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr , int start , int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr , start ,mid);
        mergeSort(arr , mid , end);
        merge(arr, start , mid , end);
    }

    public static void merge(int[] arr , int start , int mid , int end){
        if(arr[mid - 1] >= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr [j++];
        }

        System.arraycopy(arr , i , arr , start +tempIndex, mid - i);
        System.arraycopy(temp , 0 ,arr , start , tempIndex);
    }
}