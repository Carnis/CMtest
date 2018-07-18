package com.cm.cmtest.modtut;

import com.cm.cmtest.modtut.items.FirstItem;
import com.cm.cmtest.modtut.items.MultiModelItem;
import com.cm.cmtest.modtut.items.SimpleTexturedItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("modtut:firstitem")
    public static FirstItem firstItem;

    @GameRegistry.ObjectHolder("modtut:simpletextureditem")
    public static SimpleTexturedItem simpleTexturedItem;

    @GameRegistry.ObjectHolder("modtut:multimodelitem")
    public static MultiModelItem multiModelItem;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedItem.initModel();
        multiModelItem.initModel();
    }

}
