package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class BaggiumShovel extends ItemSpade {
    public static final String id = "baggium_shovel";
    public BaggiumShovel(ToolMaterial material){
        super(material);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
