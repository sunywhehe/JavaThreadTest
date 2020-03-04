package com.sunyouwei.concurrent.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // 定时调度，每个调度任务会至少等待`period`的时间，
        // 如果任务执行的时间超过`period`，则等待的时间为任务执行的时间
        executor.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(10000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 2, TimeUnit.SECONDS);

        // 定时调度，第二个任务执行的时间 = 第一个任务执行时间 + `delay`
        executor.scheduleWithFixedDelay(() -> {
            try {
                Thread.sleep(5000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 2, TimeUnit.SECONDS);

        // 定时调度，延迟`delay`后执行，且只执行一次
        executor.schedule(() -> System.out.println("5 秒之后执行 schedule"), 5, TimeUnit.SECONDS);
    }
}
