package com.scchalms.baggiomod;

import com.scchalms.baggiomod.blocks.BaggiumBlock;
import com.scchalms.baggiomod.blocks.BaggiumCharger;
import com.scchalms.baggiomod.blocks.BaggiumOre;
import com.scchalms.baggiomod.blocks.BlockFirstBlock;
import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.items.*;
import com.scchalms.baggiomod.material.BaggioMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = BaggioMod.MODID)
public class EventSubscriber {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        final Block[] blocks = {
                new BlockFirstBlock().setRegistryName(BlockFirstBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BlockFirstBlock.id),
                new BaggiumOre().setRegistryName(BaggiumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumOre.id),
                new BaggiumBlock().setRegistryName(BaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumBlock.id),
                new BaggiumCharger().setRegistryName(BaggiumCharger.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumCharger.id)
        };
        event.getRegistry().registerAll(blocks);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        final Item[] items = {
                new BruhItem().setRegistryName(BruhItem.id).setUnlocalizedName(BaggioMod.MODID + "." + BruhItem.id),
                new BasicItem().setRegistryName(BasicItem.id).setUnlocalizedName(BaggioMod.MODID + "." + BasicItem.id),
                new Microchip().setRegistryName(Microchip.id).setUnlocalizedName(BaggioMod.MODID + "." + Microchip.id),
                new BaggiumIngot().setRegistryName(BaggiumIngot.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumIngot.id),
                new BaggiumSword(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumSword.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumSword.id)
        };
        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(BlockFirstBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BlockFirstBlock.id),
                new ItemBlock(ModBlocks.BAGGIUM_ORE).setRegistryName(BaggiumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumOre.id),
                new ItemBlock(ModBlocks.BAGGIUM_BLOCK).setRegistryName(BaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumBlock.id),
                new ItemBlock(ModBlocks.BAGGIUM_CHARGER).setRegistryName(BaggiumCharger.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumCharger.id),

        };
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
