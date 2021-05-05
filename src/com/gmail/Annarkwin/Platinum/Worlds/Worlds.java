package com.gmail.Annarkwin.Platinum.Worlds;

import org.bukkit.plugin.java.JavaPlugin;

public class Worlds extends JavaPlugin
{

	@Override
	public void onEnable()
	{

		// Load configuration serializable classes
		registerSerializables();

		// Retrieve file data

		// Enable plugin features
		enableListeners();
		enableCommands();

		// Initialize update event

		// Load Worlds
//		Bukkit.createWorld(WorldCreator.name("TestWorld1"));
	}

	@Override
	public void onDisable()
	{

		// Save data
	}

	private void registerSerializables()
	{

	}

	public void enableCommands()
	{

	}

	public void enableListeners()
	{

		getServer().getPluginManager().registerEvents(new ListenerTest(), this);

	}

}
