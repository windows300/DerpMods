package com.github.derpmods.core;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModDerpMods.MODID, version = ModDerpMods.VERSION)
public class ModDerpMods {
	
	public static final String MODID = "derpmods";
	public static final String VERSION = "0.1a";
	
	public static Block testOre;
	
	@EventHandler
	public void preinit(FMLInitializationEvent event) {
		
		/* It's best practice to register blocks in preinit.
		 * The way we set this up is so that all we have to do
		 * is call and store a new version of BlockTestOre into
		 * a local variable in this class. NEVER REFRENCE
		 * BlockTestOre but here. Use the variable we store here.
		*/
		testOre = new BlockTestOre();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
}
