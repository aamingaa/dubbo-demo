package org.apache.circuitBreaker.service;

public  class Service {

    public String process(int i) {
        System.out.println("进入process方法,number:" + i);
        throw new RuntimeException(String.valueOf(i));
    }

    public void processSuccess() {
        System.out.println("调用processSuccess方法");
    }
}