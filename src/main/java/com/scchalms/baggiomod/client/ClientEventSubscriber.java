package com.scchalms.baggiomod.client;

import com.scchalms.baggiomod.BaggioMod;
import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = BaggioMod.MODID, value = Side.CLIENT)
public class ClientEventSubscriber {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        registerModel(ModItems.BRUH_ITEM);
        registerModel(ModItems.BASIC_ITEM);
        registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK));
    }
    public static void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
