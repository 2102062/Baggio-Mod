package com.2102062.baggiomod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BaggioMod.MODID, name = BaggioMod.NAME, version = BaggioMod.VERSION, acceptedMinecraftVersions = BaggioMod.MC_VERSION)
public class BaggioMod
{
    public static final String MODID = "baggiomod";
    public static final String NAME = "Baggio Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
    public static Item TEST;
    private static Logger logger;

    public static final String CLIENT_PROXY = "com.2102062.baggiomod.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.2102062.baggiomod.proxy.ServerProxy";
    @SidedProxy(clientSide = BaggioMod.CLIENT_PROXY, serverSide = BaggioMod.SERVER_PROXY)
    public static IProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        TEST = new ModItem("bruh_item");

        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    private class ModBlock extends Block {
        public ModBlock(Material material, String BlockName){
            super(material);
            this.setRegistryName(BlockName);
            this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        }
    }
    private class ModItem extends Item {
        public ModItem(String itemName){
            super();
            this.setRegistryName(itemName);
            this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        }
    }

}
