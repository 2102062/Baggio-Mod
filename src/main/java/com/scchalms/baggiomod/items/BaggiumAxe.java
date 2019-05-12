package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class BaggiumAxe extends ItemAxe {
    public static final String id = "baggium_axe";
    public BaggiumAxe(ToolMaterial material, float damage, float speed){
        super(material, damage, speed);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
    public BaggiumAxe(ToolMaterial material){
        this(material, 7.5f, -3.0f);
    }
}
