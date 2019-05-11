package com.scchalms.baggiomod.items;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BaggiumLeggings extends ItemArmor {
    public static final String id = "baggium_leggings";
    public BaggiumLeggings(ArmorMaterial material){
        super(material, 0 ,EntityEquipmentSlot.LEGS);
        setCreativeTab(BaggioMod.BAGGIO_TAB);
    }
}
