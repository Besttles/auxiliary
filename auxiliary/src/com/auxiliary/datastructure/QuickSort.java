package com.auxiliary.datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Created by biwh on 2020/11/18.
 */
public class QuickSort {
    public static void main(String [] args){
        int [] param = new int[]{1,5,3,7,8,4,2,9,3,5};
        sort(param , 0 , param.length-1);
        for (int i: param) {
            System.out.println(i+",");
        }
    }

    public static void sort(int[] param , int low , int high){
        if(low < high){
            int pivot = quick(param , low , high);
            sort(param , low , pivot-1);   //递归调用
            sort(param , pivot+1 , high);
        }
    }

    public static int quick(int [] param , int low , int high){
        //快速排序每一趟都找到一个数的正确位置
        int pivot = param[low];
        while(low < high){   //当low 《 high，程序没有结束时
            while(low < high && param[high] >= pivot) --high ;  //高位的数值大于中轴线
            param[low] = param[high];
            while(low < high && param[low] <= pivot) ++low  ;   //低位的数值小于中轴线
            param[high] = param[low];
        }
        param[low] = pivot; //将中轴线赋值给低位
        return low;
    }
}
