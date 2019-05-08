package com.scchalms.baggiomod.blocks;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MachineChassis extends Block {
    public static final String id = "machine_chassis";
    public MachineChassis(){
        super(Material.IRON);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe",1);
        setHardness(2.0f);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return false;
    }
}
