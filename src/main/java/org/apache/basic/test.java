package org.apache.basic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class test {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");


    }
    void get(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {

        }
    }
}

