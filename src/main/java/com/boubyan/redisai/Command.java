package com.boubyan.redisai;

import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.jedis.util.SafeEncoder;

public enum Command implements ProtocolCommand {

    FT_SEARCH("FT.SEARCH");

    private final byte[] raw;

    private Command(String... args) {
        // Combine the command and its arguments into a single string
        StringBuilder commandStringBuilder = new StringBuilder(args[0]);
        for (int i = 1; i < args.length; i++) {
            commandStringBuilder.append(" ").append(args[i]);
        }
        raw = SafeEncoder.encode(commandStringBuilder.toString());
    }

    @Override
    public byte[] getRaw() {
        return raw;
    }
}
