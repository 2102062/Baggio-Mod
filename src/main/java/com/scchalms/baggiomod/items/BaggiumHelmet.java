package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemHoe;

public class BaggiumHelmet extends ItemArmor {
    public static final String id = "baggium_helmet";
    public BaggiumHelmet(ArmorMaterial material){
        super(material, 0 ,EntityEquipmentSlot.HEAD);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
