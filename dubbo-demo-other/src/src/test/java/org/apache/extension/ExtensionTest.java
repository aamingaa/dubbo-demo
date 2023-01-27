package org.apache.extension;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.extension.api.AdaptiveExt;
import org.junit.Test;

/**
 * https://segmentfault.com/a/1190000020384210
 * @Adaptive标注的类 > URL参数 > @SPI注解中的值
 */
public class ExtensionTest {
    /**
     * SPI上有注解,@SPI("dubbo"),url无参数,没有类上添加@Adaptive注解,方法@Adaptive注解上无参数,输出dubbo
     */
    @Test
    public void test1(){
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.echo("d", url));
    }
    /**
     * SPI上有注解,@SPI("dubbo"),URL中也有具体的值,输出spring cloud,注意这里对方法标注有@Adaptive注解,
     * 但是该注解没有值
     */
    @Test
    public void test2(){
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    /**
     * SPI上有注解,@SPI("dubbo"),URL中也有具体的值,ThriftAdaptiveExt实现类上面有@Adaptive注解,输出thrift
     */
    @Test
    public void test3(){
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    /**
     * SPI上有注解,@SPI("dubbo"),URL中也有具体的值,接口方法中加上注解@Adaptive({"t"}),各个实现类上面没有
     * @Adaptive注解,输出spring cloud
     */
    @Test
    public void test4(){
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?t=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }

}
