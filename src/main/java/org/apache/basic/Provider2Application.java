package org.apache.basic;

import org.apache.basic.api.DemoService;
import org.apache.basic.impl.DemoServiceImpl;
import org.apache.basic.impl.DemoServiceImpl2;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class Provider2Application {
    public static void main(String[] args) throws Exception {
        startWithBootstrap();
    }
    private static void startWithBootstrap() {
        ServiceConfig<DemoServiceImpl2> service = new ServiceConfig<>();
        service.setInterface(DemoService.class);
        service.setRef(new DemoServiceImpl2());
        service.setWeight(10);
        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
//        String appName = "dubbo-demo-api-providerproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderprovider";
        String appName = "dubbo-demo-api-provider-2";
        bootstrap.application(new ApplicationConfig(appName))
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig(CommonConstants.DUBBO, 20802))
                .service(service)
                .start()
                .await();
    }
}
