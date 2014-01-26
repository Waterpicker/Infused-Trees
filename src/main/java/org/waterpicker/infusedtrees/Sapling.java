package org.waterpicker.infusedtrees;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Sapling extends BlockSapling
{
    public Icon sapling;;
    private String resource;
    public Sapling(int par1, String resource) {
        super(par1);
        this.resource = resource;
        setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName(resource + "_sapling");
        setCreativeTab(InfusedTrees.getTab());
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public void registerIcons(IconRegister register) {
        sapling = register.registerIcon("infusedtrees:" + resource + "_sapling");
    }
    public Icon getIcon(int a, int b) {
        return sapling;
    }
}