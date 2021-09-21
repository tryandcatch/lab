package cn.huangxiutao.threadpool.simple;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author huangxiutao
 * @date 2021/7/28
 */
public class SimpleThreadMain {
    public static void main(String[] args) {
        //new 自定义线程
        Thread mythread = new MyThread();
        mythread.start();

        //new 线程 指定runable
        Thread myrunable = new Thread(new MyRunnable());
        myrunable.start();

        //
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.setNameFormat("my-thread-%d");
        Executor executor = Executors.newFixedThreadPool(2, threadFactoryBuilder.build());
        Future<Integer> futureResult = ((ExecutorService) executor).submit(new MyCallable());
    }
}
