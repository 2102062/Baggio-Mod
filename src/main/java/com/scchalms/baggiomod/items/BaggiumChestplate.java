package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BaggiumChestplate extends ItemArmor {
    public static final String id = "baggium_chestplate";
    public BaggiumChestplate(ArmorMaterial material){
        super(material, 0 ,EntityEquipmentSlot.CHEST);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
