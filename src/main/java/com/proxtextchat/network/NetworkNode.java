package com.proxtextchat.network;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;

import java.util.HashSet;

public class NetworkNode {
    private BlockPos Location;

    private NetworkChannel Channel;

    private HashSet<Chunk> Chunks;

    public NetworkNode(NetworkChannel channel, BlockPos location, HashSet<Chunk> chunks){
        Channel = channel;
        Location = location;
        Chunks = chunks;
    }

    public BlockPos getLocation() {
        return Location;
    }

    public NetworkChannel getChannel() {
        return Channel;
    }

    public HashSet<Chunk> getChunks() {
        return Chunks;
    }
}
