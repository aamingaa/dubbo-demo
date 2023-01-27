package org.apache.basic.impl;

import org.apache.basic.api.DemoService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public class DemoServiceImpl2 implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl2.class);

    @Override
    public String sayHello(String name) {
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getServiceContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getServiceContext().getLocalAddress();
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        return null;
    }


}