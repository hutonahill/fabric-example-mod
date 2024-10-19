package com.proxtextchat.network;

import java.util.UUID;

public class NetworkChannel {
    private final UUID ChannelId;
    private final String ChannelName;

    public NetworkChannel(String channelName){
        ChannelId = UUID.randomUUID();
        ChannelName = channelName;
    }
}
