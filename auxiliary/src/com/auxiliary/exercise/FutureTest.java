package com.auxiliary.exercise;

import com.sun.org.apache.xpath.internal.functions.Function;

import java.util.concurrent.*;

/**
 * Created by biwh on 2021/1/30.
 */
public class FutureTest implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "return result";
    }
}
