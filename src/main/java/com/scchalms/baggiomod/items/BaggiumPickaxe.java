package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class BaggiumPickaxe extends ItemPickaxe {
    public static final String id = "baggium_pickaxe";
    public BaggiumPickaxe(ToolMaterial material){
        super(material);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
