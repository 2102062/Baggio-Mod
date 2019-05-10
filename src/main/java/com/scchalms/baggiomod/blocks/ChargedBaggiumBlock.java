package com.scchalms.baggiomod.blocks;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChargedBaggiumBlock extends Block {
    public static final String id = "charged_baggium_block";
    public ChargedBaggiumBlock(){
        super(Material.IRON);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe",2);
        setHardness(2.0f);
    }
}