package com.scchalms.baggiomod.material;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BaggioMaterials {
    public static final ToolMaterial BAGGIUM_TOOL = EnumHelper.addToolMaterial(BaggioMod.MODID + "." + "baggium_tool",2,1200,7.5f,4.5f,10);
    public static final ToolMaterial CHARGED_BAGGIUM_TOOL = EnumHelper.addToolMaterial(BaggioMod.MODID + "." + "baggium_tool",3,1600,9.5f,6.5f,30);
}
