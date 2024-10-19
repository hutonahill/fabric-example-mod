package com.proxtextchat.network;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;

public class ChunkUtils {
    public static boolean isBlockPosInChunk(BlockPos blockPos, Chunk chunk) {
        // Get the chunk's position
        int chunkX = chunk.getPos().x;
        int chunkZ = chunk.getPos().z;

        // Calculate the boundaries of the chunk
        int minX = chunkX * 16;
        int maxX = minX + 15; // Chunks are 16 blocks wide
        int minZ = chunkZ * 16;
        int maxZ = minZ + 15; // Chunks are 16 blocks deep

        // Check if the BlockPos is within the chunk's boundaries
        return blockPos.getX() >= minX && blockPos.getX() <= maxX &&
                blockPos.getZ() >= minZ && blockPos.getZ() <= maxZ;
    }
}
