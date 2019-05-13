package com.scchalms.baggiomod;

import com.scchalms.baggiomod.blocks.*;
import com.scchalms.baggiomod.init.ModBlocks;
import com.scchalms.baggiomod.items.*;
import com.scchalms.baggiomod.material.BaggioMaterials;
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
                new BaggiumOre().setRegistryName(BaggiumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumOre.id),
                new BaggiumBlock().setRegistryName(BaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumBlock.id),
                new BaggiumCharger().setRegistryName(BaggiumCharger.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumCharger.id),
                new MachineChassis().setRegistryName(MachineChassis.id).setUnlocalizedName(BaggioMod.MODID + "." + MachineChassis.id),
                new PassiveGenerator().setRegistryName(PassiveGenerator.id).setUnlocalizedName(BaggioMod.MODID + "." + PassiveGenerator.id),
                new ChargedBaggiumBlock().setRegistryName(ChargedBaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + ChargedBaggiumBlock.id),
                new EnrichedBaggiumBlock().setRegistryName(EnrichedBaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + EnrichedBaggiumBlock.id),
                new ColoriumOre().setRegistryName(ColoriumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + ColoriumOre.id),
        };
        event.getRegistry().registerAll(blocks);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        final Item[] items = {
                new BruhItem().setRegistryName(BruhItem.id).setUnlocalizedName(BaggioMod.MODID + "." + BruhItem.id),
                new Microchip().setRegistryName(Microchip.id).setUnlocalizedName(BaggioMod.MODID + "." + Microchip.id),
                new EnrichedMicrochip().setRegistryName(EnrichedMicrochip.id).setUnlocalizedName(BaggioMod.MODID + "." + EnrichedMicrochip.id),
                new AdvancedMicrochip().setRegistryName(AdvancedMicrochip.id).setUnlocalizedName(BaggioMod.MODID + "." + AdvancedMicrochip.id),
                new RainbowMicrochip().setRegistryName(RainbowMicrochip.id).setUnlocalizedName(BaggioMod.MODID + "." + RainbowMicrochip.id),
                new ItemBlock(ModBlocks.BAGGIUM_ORE).setRegistryName(BaggiumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumOre.id),
                new BaggiumIngot().setRegistryName(BaggiumIngot.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumIngot.id),
                new ItemBlock(ModBlocks.BAGGIUM_BLOCK).setRegistryName(BaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumBlock.id),
                new BaggiumNugget().setRegistryName(BaggiumNugget.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumNugget.id),
                new BaggiumSword(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumSword.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumSword.id),
                new BaggiumPickaxe(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumPickaxe.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumPickaxe.id),
                new BaggiumShovel(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumShovel.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumShovel.id),
                new BaggiumAxe(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumAxe.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumAxe.id),
                new BaggiumHoe(BaggioMaterials.BAGGIUM_TOOL).setRegistryName(BaggiumHoe.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumHoe.id),
                new BaggiumHelmet(BaggioMaterials.BAGGIUM_ARMOR).setRegistryName(BaggiumHelmet.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumHelmet.id),
                new BaggiumChestplate(BaggioMaterials.BAGGIUM_ARMOR).setRegistryName(BaggiumChestplate.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumChestplate.id),
                new BaggiumLeggings(BaggioMaterials.BAGGIUM_ARMOR).setRegistryName(BaggiumLeggings.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumLeggings.id),
                new BaggiumBoots(BaggioMaterials.BAGGIUM_ARMOR).setRegistryName(BaggiumBoots.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumBoots.id),
                new ChargedBaggiumIngot().setRegistryName(ChargedBaggiumIngot.id).setUnlocalizedName(BaggioMod.MODID + "." + ChargedBaggiumIngot.id),
                new ItemBlock(ModBlocks.CHARGED_BAGGIUM_BLOCK).setRegistryName(ChargedBaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + ChargedBaggiumBlock.id),
                new EnrichedBaggiumIngot().setRegistryName(EnrichedBaggiumIngot.id).setUnlocalizedName(BaggioMod.MODID + "." + EnrichedBaggiumIngot.id),
                new ItemBlock(ModBlocks.ENRICHED_BAGGIUM_BLOCK).setRegistryName(EnrichedBaggiumBlock.id).setUnlocalizedName(BaggioMod.MODID + "." + EnrichedBaggiumBlock.id),
                new AnshCharm().setRegistryName(AnshCharm.id).setUnlocalizedName(BaggioMod.MODID + "." + AnshCharm.id),
                new AnshShield().setRegistryName(AnshShield.id).setUnlocalizedName(BaggioMod.MODID + "." + AnshShield.id),
                new ColoriumIngot().setRegistryName(ColoriumIngot.id).setUnlocalizedName(BaggioMod.MODID + "." + ColoriumIngot.id),
                new ItemBlock(ModBlocks.COLORIUM_ORE).setRegistryName(ColoriumOre.id).setUnlocalizedName(BaggioMod.MODID + "." + ColoriumOre.id),
                new ItemBlock(ModBlocks.MACHINE_CHASSIS).setRegistryName(MachineChassis.id).setUnlocalizedName(BaggioMod.MODID + "." + MachineChassis.id),
                new ItemBlock(ModBlocks.BAGGIUM_CHARGER).setRegistryName(BaggiumCharger.id).setUnlocalizedName(BaggioMod.MODID + "." + BaggiumCharger.id),
                new ItemBlock(ModBlocks.PASSIVE_GENERATOR).setRegistryName(PassiveGenerator.id).setUnlocalizedName(BaggioMod.MODID + "." + PassiveGenerator.id),
        };
        event.getRegistry().registerAll(items);
    }
}
