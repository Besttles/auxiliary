package com.auxiliary.datastructure;

/**
 * Created by biwh on 2020/11/25.
 */
public class MergeSort {
    public static void main(String [] args){
        int [] A = new int[]{1,6,5,8,9,2,5,4,7,5,4};
        mergeSort(A , 0 , A.length-1);
        for (int i: A) {
            System.out.print(i);
        }
    }

    //assist array
    public static int [] B = new int[11];

    public static void merge(int [] A , int low ,int mid , int high){
        //将A数组复制到B中
        int k = 0;
        for (k = low; k <= high; k++) {
            B[k] = A[k];
        }
        int i , j;
        for ( i = low ,  j =mid+1 ,k=i ; i<=mid && j<=high ;k++ ){
            if (B[i] <= B[j])
                A[k] = A[i++];
            else
                A[k] = B[j++];
        }
        //将数据没有读完的半组写入A组
        while(i <= mid)
            A[k++] = B[i++];
        while(j<=high)
            A[k++] = B[j++];
    }

    /*
    分割数组，用递归的方法来将数组分为二路进行归并
     */
    public static void mergeSort(int[] A , int low , int high){
        if (low < high){
            int mid = (low + high )/2;
            mergeSort(A , low , mid);
            mergeSort(A , mid+1 , high);
            merge(A , low , mid , high);
        }
    }
}
