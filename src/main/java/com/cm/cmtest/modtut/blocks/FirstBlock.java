package com.cm.cmtest.modtut.blocks;

import com.cm.cmtest.modtut.ModTut;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlock extends Block {

    public FirstBlock() {
        super(Material.ROCK);
        setUnlocalizedName(ModTut.MODID + ".firstblock");
        setRegistryName("firstblock");
    }
}
