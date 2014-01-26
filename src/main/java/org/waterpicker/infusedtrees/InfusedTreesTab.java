package org.waterpicker.infusedtrees;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class InfusedTreesTab extends CreativeTabs {
    protected InfusedTreesTab() {
        super("infusedtrees");
        LanguageRegistry.instance().addStringLocalization("infusedleaves", "en_US", "Infused Trees");
    }

    @Override
    public int getTabIconItemIndex() {
        return Tree.getTree("diamond").getLog().blockID;
    }
}
