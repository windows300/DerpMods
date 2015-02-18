package com.github.derpmods.core;

import com.sun.istack.internal.logging.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModDerpMods.MODID, version = ModDerpMods.VERSION)
public class ModDerpMods {
	
	public static final String MODID = "derpmods";
	public static final String VERSION = "0.1a";
	
	public static Block testOre;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		
		// Basicly create and store a new Instance of the Test Ore.
		testOre = new BlockTestOre();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		// We want the stuff in the if statment to only run on the client side of things
		if (event.getSide().equals(Side.CLIENT)) {
			
			// Store this in a variable so we don't have such huge lines.
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			
			// This line make it so that the block or item registers in the inventory.
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(testOre), 0,
					new ModelResourceLocation(MODID + ":" + BlockTestOre.name, "inventory"));
		}
		
	}
	
}
