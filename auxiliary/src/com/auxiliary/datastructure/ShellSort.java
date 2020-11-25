package com.auxiliary.datastructure;

import java.util.Arrays;

/**
 * Created by biwh on 2020/11/25.
 */
public class ShellSort {
        public static void main(String[] args) {
            int [] arr = new int [] {1,4,3,2,8,4,6,2,5,6,2};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        public static void sort(int [] arr) {
            int k = 1;
            //遍历所有的步长
            for(int d = arr.length/2;d>0;d/=2) {
                //遍历所有的元素
                for(int i = d ; i<arr.length ;i++) {
                    //遍历本组前面的元素
                    for(int j = i-d;j>=0;j-=d) {
                        //当当前的元素大于后面步长后的元素
                        if(arr[j] > arr[j+d]) {
                            //交换位置
                            int tem = arr[j];
                            arr[j] = arr[j+d];
                            arr[j+d] = tem;
                        }
                    }
                }
                System.out.println("第"+(k++)+"次排序"+ Arrays.toString(arr));
            }

        }
}
