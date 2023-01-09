package org.apache.activate;

import org.apache.activate.api.ActivateExt;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.extension.api.AdaptiveExt;
import org.junit.Test;

import java.util.List;


/**
 * https://segmentfault.com/a/1190000020598592
 * @Adaptive标注的类 > URL参数 > @SPI注解中的值
 */
public class ActivateTest {
    /**
     * 1
     * class com.alibaba.dubbo.demo.provider.activate.impl.ActivateExtImpl1
     */
    @Test
    public void test1(){
        ExtensionLoader<ActivateExt> loader = ExtensionLoader.getExtensionLoader(ActivateExt.class);
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateExt> list = loader.getActivateExtension(url, new String[]{}, "default");
        System.out.println(list.size());
        list.forEach(item -> System.out.println(item.getClass()));
    }

    /**
     * 1
     * class com.alibaba.dubbo.demo.provider.activate.impl.GroupActivateExtImpl
     */
    @Test
    public void test2(){
        ExtensionLoader<ActivateExt> loader = ExtensionLoader.getExtensionLoader(ActivateExt.class);
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateExt> list = loader.getActivateExtension(url, new String[]{}, "group1");
        System.out.println(list.size());
        list.forEach(item -> System.out.println(item.getClass()));
    }

    /**
     * 2
     * class com.alibaba.dubbo.demo.provider.activate.impl.OrderActivateExtImpl1
     * class com.alibaba.dubbo.demo.provider.activate.impl.ValueActivateExtImpl
     */
    @Test
    public void test3(){
        ExtensionLoader<ActivateExt> loader = ExtensionLoader.getExtensionLoader(ActivateExt.class);
        URL url = URL.valueOf("test://localhost/test");
        // 注意这里要使用url接收,不能直接url.addParameter()
        url = url.addParameter("value", "test");
        List<ActivateExt> list =
                loader.getActivateExtension(url, new String[]{"order1", "default"}, "group");
        System.out.println(list.size());
        list.forEach(item -> System.out.println(item.getClass()));
    }

    /**
     * 2
     * class com.alibaba.dubbo.demo.provider.activate.impl.OrderActivateExtImpl2
     * class com.alibaba.dubbo.demo.provider.activate.impl.OrderActivateExtImpl1
     */
    @Test
    public void test4(){
        ExtensionLoader<ActivateExt> loader = ExtensionLoader.getExtensionLoader(ActivateExt.class);
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateExt> list = loader.getActivateExtension(url, new String[]{}, "order");
        System.out.println(list.size());
        list.forEach(item -> System.out.println(item.getClass()));
    }

}
