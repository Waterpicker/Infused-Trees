package org.waterpicker.infusedtrees;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid="infusedtrees", name="Infused Trees", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class InfusedTrees
{
    private static InfusedTreesTab tab = new InfusedTreesTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        Tree.createTree("diamond");
        Tree.createTree("iron");
    }

    public static InfusedTreesTab getTab() {
        return tab;
    }
}