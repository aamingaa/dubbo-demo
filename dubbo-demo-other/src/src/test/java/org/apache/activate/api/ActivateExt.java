package org.apache.activate.api;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface ActivateExt {
    String echo(String msg);
}