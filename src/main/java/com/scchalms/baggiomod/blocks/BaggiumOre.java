package com.scchalms.baggiomod.blocks;


import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaggiumOre extends Block {
    public static final String id = "baggium_ore";
    public BaggiumOre(){
        super(Material.ROCK);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
        setHardness(3.0f);
        setHarvestLevel("pickaxe", 2);
        setSoundType(SoundType.STONE);
    }
}
