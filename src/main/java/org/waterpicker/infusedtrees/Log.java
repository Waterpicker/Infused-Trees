package org.waterpicker.infusedtrees;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class Log extends BlockLog {

    private Icon side;
    private Icon top;
    private String resource;


    public Log(int par1, String resource) {
        super(par1);
        this.resource = resource;
        setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName(resource + "_log");
        setCreativeTab(InfusedTrees.getTab());
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public void registerIcons(IconRegister register) {
        top = register.registerIcon("infusedtrees:" + resource + "_log");
        side = register.registerIcon("infusedtrees:" + resource + "_log_side");
    }

    public Icon getIcon(int a, int b) {
        switch(a) {
            case 0: return top;
            case 1: return top;
            case 2: return side;
            case 3: return side;
            case 4: return side;
            case 5: return side;
            default: return top;
        }
    }
}
