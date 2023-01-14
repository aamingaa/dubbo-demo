package org.apache.circuitBreaker;

import org.apache.circuitBreaker.breaker.SimpleCircuitBreaker;
import org.apache.circuitBreaker.service.Service;

public class test {
    public static void main(String[] args) throws Exception {
        SimpleCircuitBreaker circuitBreaker = new SimpleCircuitBreaker(5L);
        Service service = new Service();
        for (int i = 0; i < 10; i++) {
            int temp = i;
            String result = circuitBreaker.call(() -> service.process(temp));
            System.out.println(String.format("返回结果:%s,number:%d", result, temp));
        }
    }
}
