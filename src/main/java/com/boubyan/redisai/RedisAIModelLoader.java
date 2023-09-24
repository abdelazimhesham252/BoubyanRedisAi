package com.boubyan.redisai;

import redis.clients.jedis.Jedis;

public class RedisAIModelLoader {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379); // Replace with your RedisAI server information

        jedis.set("mymodel", "<model_blob>");

        jedis.close();
    }
}
