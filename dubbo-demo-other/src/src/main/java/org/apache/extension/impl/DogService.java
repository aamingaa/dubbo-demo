package org.apache.extension.impl;


import org.apache.dubbo.common.URL;
import org.apache.extension.Animal;
import org.apache.extension.api.AnimalService;

public class DogService implements AnimalService {

    @Override
    public void say() {
        System.out.println("dog say woo woo");
    }

    @Override
    public void show(URL url) {
        System.out.println("dog" + url.toString());
    }

    @Override
    public void run(Animal animal) {
        System.out.println("dog" + animal.getUrl().toString());
    }
}
