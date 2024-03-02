package com.charpy.blockraid.blockraid;

import com.charpy.blockraid.blockraid.proxy.CommonProxy;
import com.charpy.blockraid.blockraid.util.Reference;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
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
        DiscordRPC.discordInitialize("1193252034548355162", null, false);
        DiscordRichPresence presence = new DiscordRichPresence();
        presence.startTimestamp = System.currentTimeMillis() / 1000;
        presence.details = "Making RPC";
        presence.state = "Working on :)";
        presence.largeImageKey = "ww2";
        presence.largeImageText = "ez";
        DiscordRPC.discordUpdatePresence(presence);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> DiscordRPC.discordShutdown()));
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}