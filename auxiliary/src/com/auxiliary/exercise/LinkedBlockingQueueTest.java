package com.auxiliary.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by biwh on 2021/1/27.
 */
public class LinkedBlockingQueueTest {

    public static LinkedBlockingQueue queue = new LinkedBlockingQueue<String>();  //创建一个 LinkedBlockingDeque ，容量为 Integer.MAX_VALUE 。

    public static LinkedBlockingQueue queue2 = new LinkedBlockingQueue(1000); //创建一个具有给定（固定）容量的 LinkedBlockingQueue 。

    public static LinkedBlockingQueue queue3 = new LinkedBlockingQueue(Arrays.asList("a" , "b" , "c" , "d"));  //创建一个 LinkedBlockingQueue ，容量为 Integer.MAX_VALUE ，最初包含给定集合的元素，以集合的迭代器的遍历顺序添加。


    public static void main(String [] args){

        queue.offer("a" );
        queue.offer("b" );
        queue.offer("c" );
        queue.offer("d" );
        queue.offer("e" );

        //queue.clear();//从这个队列中原子地删除所有的元素。

        System.out.println(queue.contains("c"));

        while(!queue.isEmpty()){

            System.out.println(queue.poll());

        }



    }
}
