package com.auxiliary.tester;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by biwh on 2023/3/1.
 */
public class SymphreTest {

    public static Semaphore sym = new Semaphore(2);

    public static void main(String [] args) throws InterruptedException {

        new Thread(() -> {
            try {
                sym.acquire(1);
                TimeUnit.SECONDS.sleep(10);
                sym.release();
                System.out.println("1:realse");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> {
            try {
                sym.acquire(1);
                TimeUnit.SECONDS.sleep(9);
                sym.release();
                System.out.println("2:realse");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        //sym.release();//如果单独执行该方法也会出现释放信号量！
        new Thread(() -> {
            try {
                boolean status = sym.tryAcquire(1 , 5 , TimeUnit.SECONDS);
                if(status){
                TimeUnit.SECONDS.sleep(2);
                sym.release();
                System.out.println("3:realse");
                }else{
                    System.out.println("3: acquire failed!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

}
