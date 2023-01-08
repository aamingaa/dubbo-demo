package org.apache.basic.api;

import java.util.concurrent.CompletableFuture;
public interface DemoService {
    /**
     * 同步处理的服务方法
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * 用于异步处理的服务方法
     * @param name
     * @return
     */
    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
