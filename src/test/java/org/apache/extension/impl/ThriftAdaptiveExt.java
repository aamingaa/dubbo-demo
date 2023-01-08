package org.apache.extension.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.extension.api.AdaptiveExt;

// 单元测试3中加上@Adaptive注解,其余不加
@Adaptive
public class ThriftAdaptiveExt implements AdaptiveExt {
    @Override
    public String echo(String msg, URL url) {
        return "thrift";
    }
}