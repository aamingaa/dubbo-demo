package org.apache.extension.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface AdaptiveExt {
    @Adaptive
        // 单元测试方法4的注解为@Adaptive({"t"})
    String echo(String msg, URL url);
}