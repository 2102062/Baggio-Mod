package com.scchalms.baggiomod.world.gen;

import com.scchalms.baggiomod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BaggioWorldGen implements IWorldGenerator {
    private final WorldGenMinable baggioOverworldGenerator;

    public BaggioWorldGen() {
        baggioOverworldGenerator = new WorldGenMinable(ModBlocks.BAGGIUM_ORE.getDefaultState(),10, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimensionType()) {
            case OVERWORLD:
                genStandard(baggioOverworldGenerator, world, random, chunkX, chunkZ, 10, 0, 35);
            case NETHER:
                break;
            case THE_END:
                break;
        }
    }
    public void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) {
        if(minHeight < 0) minHeight = 0;
        if(maxHeight > 255) maxHeight = 255;

        if(maxHeight < minHeight){
            int temp = maxHeight;
            maxHeight = minHeight;
            minHeight = temp;
        }
        else if (maxHeight == minHeight){
            if (maxHeight < 255) maxHeight++;
            else minHeight--;
        }

        BlockPos chunkAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
        int height_diff = maxHeight - minHeight + 1;

        for(int i = 0; i < spawnTries; i++) {
            generator.generate(world, random, chunkAsBlockPos.add(random.nextInt(16), minHeight + random.nextInt(height_diff), random.nextInt(16)));
        }
    }
}
