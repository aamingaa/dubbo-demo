package org.apache.extension.impl;

import org.apache.dubbo.common.URL;
import org.apache.extension.api.AdaptiveExt;

public class SpringCloudAdaptiveExt implements AdaptiveExt {
    @Override
    public String echo(String msg, URL url) {
        return "spring cloud";
    }
}
