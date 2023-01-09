package org.apache.activate.impl;

import org.apache.activate.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

@Activate(order = 2, group = {"order"})
public class OrderActivateExtImpl1 implements ActivateExt {

    @Override
    public String echo(String msg) {
        return msg;
    }
}