package cn.huangxiutao.threadpool.simple;

/**
 * 实现Runable接口
 * @author huangxiutao
 * @date 2021/7/28
 */
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable-----");
    }
}
