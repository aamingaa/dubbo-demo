package org.apache.activate.impl;

import org.apache.activate.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

@Activate(value = {"value"}, group = {"group"})
public class ValueActivateExtImpl implements ActivateExt {

    @Override
    public String echo(String msg) {
        return msg;
    }
}