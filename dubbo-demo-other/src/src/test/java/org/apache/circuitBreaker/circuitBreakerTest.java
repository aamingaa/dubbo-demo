package org.apache.circuitBreaker;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.extension.api.AdaptiveExt;
import org.junit.Test;


public class circuitBreakerTest {

    @Test
    public void test1(){
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    @Test
    public void test2() {

    }


}
