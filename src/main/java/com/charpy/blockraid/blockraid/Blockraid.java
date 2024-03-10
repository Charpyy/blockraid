package com.charpy.blockraid.blockraid;

import com.charpy.blockraid.blockraid.proxy.CommonProxy;
import com.charpy.blockraid.blockraid.util.Reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(modid =  Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Blockraid {


    @Mod.Instance
    public static Blockraid instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}