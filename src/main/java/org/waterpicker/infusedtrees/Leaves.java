package org.waterpicker.infusedtrees;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class Leaves extends BlockLeavesBase {
    private Icon leaves;;
    private String resource;

    public Leaves(int par1, String resource) {
        super(par1, Material.wood, true);
        this.resource = resource;
        setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName(resource + "_leaves");
        setCreativeTab(InfusedTrees.getTab());
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public void registerIcons(IconRegister register) {
        leaves = register.registerIcon("infusedtrees:" + resource + "_leaves");
    }
    public Icon getIcon(int a, int b) {
        return leaves;
    }
}
