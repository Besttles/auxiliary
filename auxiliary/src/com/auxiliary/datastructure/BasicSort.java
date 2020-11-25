package com.auxiliary.datastructure;

import java.util.Arrays;

/**
 * Created by biwh on 2020/11/25.
 */
public class BasicSort {

    public static void main(String[] args) {
        int[]  arr = new int[] {1,43,65,87,23,146,347,2,8,64,74};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr) {
        //找出最大值和最大值的位数
        int maxValue = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]>maxValue) {
                maxValue = arr[i];
            }
        }
        //定义一个二维数组，来存储根据位数记录的数据
        int[][] temp = new int[10][arr.length];
        //定义一个数组来存储对应位数上的个数
        int[] count = new int[10];
        //算出需要循环几次
        int itrator = (maxValue+"").length();
        //根据基数来进行排序
        for(int k=0,n=1;k<itrator;k++,n*=10) {
            //create an array
            for(int i = 0;i<arr.length;i++) {
                int tem = arr[i]/n%10;
                temp[tem][count[tem]] = arr[i];
                count[tem]++;
            }
            //定义一个变量来记录arr的当前位数
            int e = 0;
            //将二维数组的数值存入arr
            for(int h = 0;h<10;h++) {
                if(count[h] != 0) {
                    for(int j = 0;j<count[h];j++) {
                        arr[e] = temp[h][j];
                        e++;
                    }
                    //清空计数数组中的个数
                    count[h] = 0;
                }
            }

        }

    }
}