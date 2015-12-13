package com.lyf.redis;

import java.util.Map;

/**
 * Created by TR on 2015/12/13.
 */
public class TestObject {

    private String name;
    private Double value;

    private Map<String, String> map;

    public TestObject(String name, Double value, Map<String, String> map) {
        this.name = name;
        this.value = value;
        this.map = map;
    }

    public TestObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", map=" + map +
                '}';
    }
}
