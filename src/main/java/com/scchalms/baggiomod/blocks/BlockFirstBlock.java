package com.scchalms.baggiomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFirstBlock extends Block {

    public BlockFirstBlock(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe",2);
        setHardness(2.0f);
    }

}
