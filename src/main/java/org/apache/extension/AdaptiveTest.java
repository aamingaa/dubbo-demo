package org.apache.extension;


import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.extension.api.AnimalService;

public class AdaptiveTest {

    public static void main(String[] args) {

        ExtensionLoader<AnimalService> loader = ExtensionLoader.getExtensionLoader(AnimalService.class);
        // 获取到CatService实例
        AnimalService animalService = loader.getAdaptiveExtension();
        // 返回study.rui.dubbo.impl.CatService
        System.out.println(animalService.getClass().getName());

    }

}