package com.lyf.redis;

import com.github.xsonorg.XSON;
import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by TR on 2015/12/13.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        TestObject object = new TestObject();
        Map<String, String> map = new TreeMap<String, String>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        map.put("i", "j");

        object.setName("abc");
        object.setValue(1000d);
        object.setMap(map);
        System.out.println(object);

        byte[] value = XSON.write(object);
        System.out.println(value.length);
        byte[] key = XSON.write("key");

        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set(key, value);

        Thread.sleep(10000);
        byte[] data = jedis.get(key);

        System.out.println(key);

        TestObject t = XSON.parse(data);
        System.out.println(t);

        jedis.close();
    }

}
