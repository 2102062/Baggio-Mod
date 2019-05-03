package com.scchalms.baggiomod.tabs;

import com.scchalms.baggiomod.BaggioMod;
import com.scchalms.baggiomod.init.ModItems;
import com.scchalms.baggiomod.items.BaggiumIngot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaggioModTab extends CreativeTabs {
    public BaggioModTab(){
        super(BaggioMod.MODID);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.BAGGIUM_INGOT);
    }
}
