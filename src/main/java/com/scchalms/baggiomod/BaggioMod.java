package com.scchalms.baggiomod;

import com.scchalms.baggiomod.proxy.IProxy;
import com.scchalms.baggiomod.recipes.ModRecipes;
import com.scchalms.baggiomod.tabs.BaggioModTab;
import com.scchalms.baggiomod.world.gen.BaggioWorldGen;
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = BaggioMod.MODID, name = BaggioMod.NAME, version = BaggioMod.VERSION, acceptedMinecraftVersions = BaggioMod.MC_VERSION)
public class BaggioMod
{
    public static final String MODID = "baggiomod";
    public static final String NAME = "Baggio Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
    private static Logger logger;

    public static final String CLIENT_PROXY = "com.scchalms.baggiomod.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.scchalms.baggiomod.proxy.ServerProxy";
    @SidedProxy(clientSide = BaggioMod.CLIENT_PROXY, serverSide = BaggioMod.SERVER_PROXY)
    public static IProxy proxy;

    public static final CreativeTabs BAGGIO_TAB = new BaggioModTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        logger.info(BaggioMod.NAME + " is cookin' up!");
        ModRecipes.initSmelting();
        GameRegistry.registerWorldGenerator(new BaggioWorldGen(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

    }

}
