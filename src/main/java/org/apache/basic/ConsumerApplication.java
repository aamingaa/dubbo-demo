package org.apache.basic;

import org.apache.basic.api.DemoService;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class ConsumerApplication {
    public static void main(String[] args) {
        runWithBootstrap();
    }
    private static void runWithBootstrap() {
        ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
        reference.setInterface(DemoService.class);
        reference.setRetries(1);
//        reference.setGeneric("true");
//        reference.setProtocol("");

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-demo-api-consumer");
        applicationConfig.setQosEnable(false);
        applicationConfig.setQosPort(-1);

        RegistryConfig registryConfig = new RegistryConfig("zookeeper://127.0.0.1:2181");
        registryConfig.setCluster("failover");
        bootstrap.application(applicationConfig)
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig(CommonConstants.DUBBO, 20800))
                .reference(reference)
                .start();

        DemoService demoService = bootstrap.getCache().get(reference);
        String message = demoService.sayHello("dubbo");
        System.out.println(message);

//        // generic invoke
//        GenericService genericService = (GenericService) demoService;
//        Object genericInvokeResult = genericService.$invoke("sayHello", new String[]{String.class.getName()},
//                new Object[]{"dubbo generic invoke"});
//        System.out.println(genericInvokeResult);
    }
}
