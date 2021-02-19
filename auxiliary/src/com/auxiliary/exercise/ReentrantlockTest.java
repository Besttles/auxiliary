package com.auxiliary.exercise;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by biwh on 2021/1/30.
 */
public class ReentrantlockTest implements Callable<String>{

    public static ReentrantLock lock = new ReentrantLock();

    public static ExecutorService executorService = Executors.newFixedThreadPool(10);


    static{
        System.out.println("初始化！");
    }

    public static ExecutorService cache = Executors.newCachedThreadPool();
    public static void main(String [] args){

//        ArrayList<Thread> threads = new ArrayList<>();
//
//        for(int i = 0 ; i < 5 ; i++ ) {
//            executorService.execute(new Thread(() ->{
//                getOrder();
//            }));
//        }

//        FutureTest futureTest = new FutureTest();
//
//        FutureTask<String> stringFutureTask = new FutureTask<>(futureTest);
//
//
//        executorService.submit(stringFutureTask);
//
//        executorService.shutdown();
//
//        try {
//            System.out.println(stringFutureTask.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        final Semaphore semaphore = new Semaphore(4);
//
//        for (int i = 0 ; i < 10 ; i++){
//            cache.execute(()->{
//                try {
//                    semaphore.acquire();
//                    System.out.println("get semaphore!");
//
//                    TimeUnit.SECONDS.sleep(1);
//
//                    System.out.println("do something");
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }finally {
//                    semaphore.release();
//                }
//            });
//        }


//        String string = new String("string");
//        String string2 = new String ("string");
//
//        System.out.println(string == string2);
//
//        String intern = string.intern();
//        String intern1 = string2.intern();
//
//        System.out.println(intern == intern1);
//
//        try {
//            Class<?> apple = Class.forName("com.auxiliary.exercise.Apple");
//
//            Method enclosingMethod = apple.getEnclosingMethod();
//
//            Constructor<?>[] constructors = apple.getConstructors();
//
//            for (Constructor con: constructors) {
//
//            }
//            System.out.println(apple.getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        ArrayList<Object> list = new ArrayList<>(100);
//
//        new LinkedList<>();
//
//        HashMap<String , String> hashMap = new HashMap<>();
//        hashMap.put("lili" , "beautiful");
//        hashMap.put("gigi" , "thoughtful");
//
//        hashMap.forEach((K , V) ->{
//
//            System.out.println(K + V);
//            });


        try {


            URL url = new URL("http://www.github.com");

    /* 字节流 */
            InputStream is = url.openStream();

    /* 字符流 */
            InputStreamReader isr = new InputStreamReader(is, "utf-8");

    /* 提供缓存功能 */
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getOrder(){
        lock.lock();

        System.out.println("暂停数量："+lock.getHoldCount());
        System.out.println("wait queue"+lock.getQueueLength());
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }

        lock.unlock();

    }

    @Override
    public String call() throws Exception {
        return "callable";
    }
}

    class Apple {
        private String name;

        public Apple(){}
    }

