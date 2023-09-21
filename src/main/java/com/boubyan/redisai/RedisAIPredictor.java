package com.boubyan.redisai;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.jedis.util.SafeEncoder;

public class RedisAIPredictor {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379); // Replace with your RedisAI server information

        // Input data for prediction (adjust as per your model's input requirements)
        double[] inputData = {1.0, 2.0, 3.0};

        // Make a prediction using the loaded model
        jedis.sendCommand("AI.MODELRUN", "mymodel", "INPUTS", "input", "OUTPUTS", "output", "VALUES", inputData);

        // Retrieve the prediction result
        String predictionResult = jedis.get("output");
        System.out.println("Prediction Result: " + predictionResult);

        jedis.close();
    }
}
