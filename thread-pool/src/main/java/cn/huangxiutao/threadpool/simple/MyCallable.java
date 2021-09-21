package cn.huangxiutao.threadpool.simple;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口，主要用在需要线程有返回值的场景
 * @author huangxiutao
 * @date 2021/7/28
 */
public class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("MyCallable-----");
        return 666;
    }
}
