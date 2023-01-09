package org.apache.activate.impl;

import org.apache.activate.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt {

    @Override
    public String echo(String msg) {
        return msg;
    }
}
