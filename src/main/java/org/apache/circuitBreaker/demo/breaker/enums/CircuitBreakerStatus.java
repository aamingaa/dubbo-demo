package org.apache.circuitBreaker.demo.breaker.enums;

// 断路器状态
public enum CircuitBreakerStatus {

    /**
     * 关闭
     */
    CLOSED,

    /**
     * 开启
     */
    OPEN,

    /**
     * 半开启
     */
    HALF_OPEN
}