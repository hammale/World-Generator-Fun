package me.hammale.FlatLands;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class FlatLands extends JavaPlugin {

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnable() {
		System.out.println("FlatLands Enabled!");
		
	}
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new FlatLandsChunkListener();
    }
}
