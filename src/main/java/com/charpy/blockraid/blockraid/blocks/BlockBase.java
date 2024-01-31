package com.charpy.blockraid.blockraid.blocks;

import com.charpy.blockraid.blockraid.Blockraid;
import com.charpy.blockraid.blockraid.init.ModBlocks;
import com.charpy.blockraid.blockraid.init.ModItems;
import com.charpy.blockraid.blockraid.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, String nameid, Material material) {

        super(material);
        setRegistryName(nameid);
        setTranslationKey(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

    @Override
    public void registerModels() {

        Blockraid.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

    }
}