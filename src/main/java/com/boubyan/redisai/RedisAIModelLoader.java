package com.boubyan.redisai;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.jedis.util.SafeEncoder;

public class RedisAIModelLoader {

	
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379); // Replace with your RedisAI server information

        jedis.sendCommand("AI.MODELSET", "mymodel", "TF", "CPU", "INPUTS", "input", "OUTPUTS", "output", "<model_blob>");
        

        jedis.close();
    }

}
