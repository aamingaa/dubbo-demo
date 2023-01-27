package org.apache.extension;

import org.apache.dubbo.common.URL;

public class Animal {

    private URL url;

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }
}