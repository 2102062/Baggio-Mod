package com.scchalms.baggiomod.client;

import com.scchalms.baggiomod.BaggioMod;
import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.init.ModItems;
import com.scchalms.baggiomod.items.BaggiumIngot;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.scchalms.baggiomod.init.ModItems.*;
import static com.scchalms.baggiomod.init.ModBlocks.*;

@Mod.EventBusSubscriber(modid = BaggioMod.MODID, value = Side.CLIENT)
public class ClientEventSubscriber {
    public static final Item[] items = {
            BRUH_ITEM,
            BASIC_ITEM,
            MICROCHIP,
            BAGGIUM_INGOT,

    };
    public static final Block[] blocks = {
            FIRST_BLOCK,
            BAGGIUM_ORE,

    };


    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for(Item item : items){
            registerModel(item);
        }
        for(Block block : blocks){
            registerModel(Item.getItemFromBlock(block));
        }
    }
    public static void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
