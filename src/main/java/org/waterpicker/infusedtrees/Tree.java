package org.waterpicker.infusedtrees;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Tree {

    private static HashMap<String,Tree> trees = new HashMap<>();

    private static int counter = 500;

    private Log log;
    private Sapling sapling;
    private Leaves leaves;

    private Tree(String resource) {
        log = new Log(setID(), resource);
        sapling = new Sapling(setID(), resource);
        leaves = new Leaves(setID(), resource);

        LanguageRegistry.addName(log, "Infused " + resource + " Log");
        LanguageRegistry.addName(sapling, "Infused " + resource + " Sapling");
        LanguageRegistry.addName(leaves, "Infused " + resource + " Leaves");

        GameRegistry.registerBlock(log, "Infused " + resource + " Log");
        GameRegistry.registerBlock(sapling, "Infused " + resource + " Sapling");
        GameRegistry.registerBlock(leaves, "Infused " + resource +" Leaves");
    }

    public Log getLog() {
        return log;
    }

    public Sapling getSapling() {
        return sapling;
    }

    public Leaves getLeaves() {
        return leaves;
    }

    private static int setID() {
        return counter++;
    }

    public static Tree createTree(String resource) {
        Tree tree = new Tree(resource);
        trees.put(resource, tree);
        return tree;
    }
    public static Tree getTree(String resource) {
        return trees.get(resource);
    }
}