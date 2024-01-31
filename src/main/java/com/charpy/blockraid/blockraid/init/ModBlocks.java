package com.charpy.blockraid.blockraid.init;

import com.charpy.blockraid.blockraid.blocks.BlockBase;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<BlockBase> BLOCKS = new ArrayList<>();
    public static final BlockBase RAID_BLOCK_CONCRETE = new BlockBase("concrete", "raid_block_concrete",Material.ROCK);
    public static final BlockBase RAID_BLOCK_CONCRETE_TILE = new BlockBase("concrete_tile", "raid_block_concrete_tile",Material.ROCK);
    public static final BlockBase RAID_BLOCK_CONCRETE_PILLAR_SIDE = new BlockBase("concrete_pillar_side", "raid_block_concrete_pillar_side",Material.ROCK);


}