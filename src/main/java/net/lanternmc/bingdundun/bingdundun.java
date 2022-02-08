package net.lanternmc.bingdundun;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = bingdundun.MOD_ID, name = bingdundun.MOD_NAME, version = bingdundun.VERSION)
public class bingdundun {
    public static final String MOD_ID = "bingdundun";
    public static final String MOD_NAME = "bingdundun";
    public static final String VERSION = "1.0-SNAPSHOT";
    public static final SimpleNetworkWrapper packetHandler = NetworkRegistry.INSTANCE.newSimpleChannel("bingdundun");

    @Mod.Instance(MOD_ID)
    public static bingdundun INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        System.out.println("FMLPreInitializationEvent");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("今天就是雪融融来了也没用");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        System.out.println("FMLPostInitializationEvent");
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new bingdundunBlock().setRegistryName(MOD_ID, "bingdundun"));
        }
    }
}
