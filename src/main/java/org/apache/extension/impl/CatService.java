package org.apache.extension.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.extension.Animal;
import org.apache.extension.api.AnimalService;

@Adaptive
public class CatService implements AnimalService {

    @Override
    public void say() {
        System.out.println("cat say miao miao");
    }

    @Override
    public void show(URL url) {
        System.out.println("cat" + url.toString());
    }

    @Override
    public void run(Animal animal) {
        System.out.println("cat" + animal.getUrl().toString());
    }
}