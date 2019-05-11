package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BaggiumBoots extends ItemArmor {
    public static final String id = "baggium_boots";
    public BaggiumBoots(ArmorMaterial material){
        super(material, 0 ,EntityEquipmentSlot.FEET);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
