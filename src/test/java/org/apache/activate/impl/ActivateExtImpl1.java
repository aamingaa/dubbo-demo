package org.apache.activate.impl;

import org.apache.activate.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = {"default"})
public class ActivateExtImpl1 implements ActivateExt {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
