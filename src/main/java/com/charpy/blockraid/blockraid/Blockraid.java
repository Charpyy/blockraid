package com.charpy.blockraid.blockraid;

import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import com.charpy.blockraid.blockraid.proxy.CommonProxy;
import com.charpy.blockraid.blockraid.util.Reference;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
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
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import javax.security.auth.login.LoginException;

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
        DiscordRPC lib = DiscordRPC.INSTANCE;
        String applicationId = "1193252034548355162";

        DiscordRichPresence presence = new DiscordRichPresence();
        presence.startTimestamp = System.currentTimeMillis() / 1000;
        presence.details = "WW2 ChapServer";
        presence.largeImageKey = "minecraft";
        presence.largeImageText = "Minecraft";

        lib.Discord_Initialize(applicationId, null, false, null);
        lib.Discord_UpdatePresence(presence);
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}