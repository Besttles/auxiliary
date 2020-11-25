package com.auxiliary.datastructure;

import java.util.Arrays;

/**
 * Created by biwh on 2020/11/25.
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr = new int[]{1,5,3,6,7,8};
        direct_insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    //直接插入排序
    public static void direct_insert(int [] arr) {
        //遍历数组
        for(int i = 1 ; i < arr.length ;i++) {
            //判断前一个值是不是大于当前值
            if(arr[i] < arr[i-1]) {
                //备份当前数字
                int tem = arr[i];
                int j;
                //把i之前的数子进行遍历，前面的数字已经是排好序的了
                for(j=i-1;j>0&&arr[j]>tem;j--) {
                    //移动元素
                    arr[j+1] = arr[j];
                }
                //外层把临时变量赋值
                arr[j+1] = tem;
            }
        }
    }
}