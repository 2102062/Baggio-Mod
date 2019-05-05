package com.scchalms.baggiomod.recipes;

import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void initSmelting() {
        GameRegistry.addSmelting(ModBlocks.BAGGIUM_ORE, new ItemStack(ModItems.BAGGIUM_INGOT),15.0f);
    }
}
