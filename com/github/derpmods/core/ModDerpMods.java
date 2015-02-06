package com.github.derpmods.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModDerpMods.MODID, version = ModDerpMods.VERSION)
public class ModDerpMods {
	
	public static final String MODID = "derpmods";
	public static final String VERSION = "0.1a";
	
	@EventHandler
	public void preinit(FMLInitializationEvent event) {
		
		// This is PreInit. Register Blocks and Items here. Also anything needing to be checked like
		// Dependencies should be done here 
		
	}
	
}
