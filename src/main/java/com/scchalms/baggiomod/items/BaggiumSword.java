package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class BaggiumSword extends ItemSword {
    public static final String id = "baggium_sword";
    public BaggiumSword(ToolMaterial material){
        super(material);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
