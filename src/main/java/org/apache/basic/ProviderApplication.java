package org.apache.basic;

import org.apache.basic.api.DemoService;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.basic.impl.DemoServiceImpl;

public class ProviderApplication {
    public static void main(String[] args) throws Exception {
        startWithBootstrap();
    }
    private static void startWithBootstrap() {
        ServiceConfig<DemoServiceImpl> service = new ServiceConfig<>();
        service.setInterface(DemoService.class);
        service.setRef(new DemoServiceImpl());
        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
//        String appName = "dubbo-demo-api-providerproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderproviderprovider";
        String appName = "dubbo-demo-api-provider";
        bootstrap.application(new ApplicationConfig(appName))
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig(CommonConstants.DUBBO, -1))
                .service(service)
                .start()
                .await();
    }
}
