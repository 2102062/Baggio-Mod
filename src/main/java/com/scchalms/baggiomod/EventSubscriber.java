package com.scchalms.baggiomod;

import com.scchalms.baggiomod.blocks.BaggiumOre;
import com.scchalms.baggiomod.blocks.BlockFirstBlock;
import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.items.BasicItem;
import com.scchalms.baggiomod.items.BruhItem;
import com.scchalms.baggiomod.items.Microchip;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = BaggioMod.MODID)
public class EventSubscriber {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        final Block[] blocks = {
                new BlockFirstBlock().setRegistryName("first_block").setUnlocalizedName(BaggioMod.MODID + "." + "first_block"),
                new BaggiumOre().setRegistryName("baggium_ore").setUnlocalizedName(BaggioMod.MODID + "." + "baggium_ore")
        };
        event.getRegistry().registerAll(blocks);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        final Item[] items = {
                new BruhItem().setRegistryName("bruh_item").setUnlocalizedName(BaggioMod.MODID + "." + "bruh_item"),
                new BasicItem().setRegistryName("basic_item").setUnlocalizedName(BaggioMod.MODID + "." + "basic_item"),
                new Microchip().setRegistryName("microchip").setUnlocalizedName(BaggioMod.MODID + "." + "microchip"),
        };
        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName("first_block").setUnlocalizedName(BaggioMod.MODID + "." + "first_block"),
                new ItemBlock(ModBlocks.BAGGIUM_ORE).setRegistryName("baggium_ore").setUnlocalizedName(BaggioMod.MODID + "." + "baggium_ore")
        };
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
