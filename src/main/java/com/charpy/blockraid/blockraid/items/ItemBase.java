package com.charpy.blockraid.blockraid.items;

import com.charpy.blockraid.blockraid.Blockraid;
import com.charpy.blockraid.blockraid.init.ModItems;
import com.charpy.blockraid.blockraid.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase  extends Item implements IHasModel {

    public ItemBase(String name) {
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Blockraid.proxy.registerItemRenderer(this, 0, "inventory");

    }

}