package org.apache.extension.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;
import org.apache.extension.Animal;

@SPI("dog")
public interface AnimalService {

    @Adaptive({"firstName"})
    void show(URL url);

    @Adaptive({"lastName"})
    void run(Animal animal);

    void say();

}