package org.apache.circuitBreaker.demo.breaker;

import org.apache.circuitBreaker.demo.breaker.service.Service;

public class test {
    public static void main(String[] args) throws Exception {
        SimpleCircuitBreaker circuitBreaker = new SimpleCircuitBreaker(5L);
        Service service = new Service();
        for (int i = 0; i < 10; i++) {
            int temp = i;
            String result = circuitBreaker.call(() -> service.process(temp));
            System.out.println(String.format("θΏεη»ζ:%s,number:%d", result, temp));
        }
    }
}
