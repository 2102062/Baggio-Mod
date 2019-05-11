package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class BaggiumHoe extends ItemHoe {
    public static final String id = "baggium_hoe";
    public BaggiumHoe(ToolMaterial material){
        super(material);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
