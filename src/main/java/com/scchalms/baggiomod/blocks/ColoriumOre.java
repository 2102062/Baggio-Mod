package com.scchalms.baggiomod.blocks;


import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ColoriumOre extends Block {
    public static final String id = "colorium_ore";

    public ColoriumOre() {
        super(Material.ROCK);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
        setHardness(4.0f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(1.5f);
        setSoundType(SoundType.STONE);
    }
}
