package com.sunyouwei.concurrent.chapter08;

public interface RunnableQueue {
    /**
     * 当有新的任务进来时首先会offer到 队列中
     *
     * @param runnable
     */
    void offer(Runnable runnable);

    /**
     * 工作线程通过 take 方法获取Runnable
     *
     * @return
     */
    Runnable take() throws InterruptedException;

    /**
     * 获取任务队列中任务的数量
     *
     * @return
     */
    int size();
}
