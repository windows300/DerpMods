package com.github.derpmods.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTestOre extends Block {

	// This is not what the user see's as the name. It's what Minecraft see's it as
	public final String name = "testOre";
	
	BlockTestOre() {
		
		// Basicly tell Minecraft that is like Stone.
		super(Material.rock);
		
		/* Behind the scene's name. Make sure it's unique
		 * because errors happen when you have two blocks
		 * nammed the same.
		*/
		this.setUnlocalizedName(this.name);
		
		// Set the creative tab for this Block
		this.setCreativeTab(CreativeTabs.tabBlock);
		
		// Register this block with Minecraft.
		GameRegistry.registerBlock(this, this.name);
	}
	
	public String getName() {
		return this.name;
	}
	
}
