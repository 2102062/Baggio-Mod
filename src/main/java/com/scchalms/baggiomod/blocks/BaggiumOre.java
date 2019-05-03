package com.scchalms.baggiomod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaggiumOre extends Block {
    public BaggiumOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(3.0f);
        setHarvestLevel("pickaxe", 2);
        setSoundType(SoundType.STONE);
    }
}
