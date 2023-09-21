package com.boubyan.redisai;

public class Main {

    public static void main(String[] args) {
        // Load the model
        RedisAIModelLoader.main(args);

        // Make predictions
        RedisAIPredictor.main(args);
    }
}
