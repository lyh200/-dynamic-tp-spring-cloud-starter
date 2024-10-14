package org.dromara.dynamictp.core.support;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: VirtualThreadExecutorAdapter
 * Package: org.dromara.dynamictp.core.support
 * Description:
 *     Adapter for virtual thread executor
 * @Author CYC
 * @Create 2024/10/14 15:33
 * @Version 1.0
 */
public class VirtualThreadExecutorAdapter implements ExecutorAdapter<ExecutorService> {

    private final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    @Override
    public ExecutorService getOriginal() {
        return this.executor;
    }

    @Override
    public int getCorePoolSize() {
        return 0;
    }

    @Override
    public void setCorePoolSize(int corePoolSize) {

    }

    @Override
    public int getMaximumPoolSize() {
        return 0;
    }

    @Override
    public void setMaximumPoolSize(int maximumPoolSize) {

    }

    @Override
    public int getPoolSize() {
        return 0;
    }

    @Override
    public int getActiveCount() {
        return 0;
    }


}
