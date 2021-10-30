package com.gmail.Annarkwin.Platinum.Worlds;

import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.Annarkwin.Platinum.API.PlatinumMainCommand;
import com.gmail.Annarkwin.Platinum.Worlds.Commands.Worlds.CommandWorlds;
import com.gmail.Annarkwin.Platinum.Worlds.Commands.Worlds.WorldsGo;

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
		WorldCreator aincrad = WorldCreator.name("Aincrad");
		aincrad.environment(Environment.NORMAL);
		aincrad.seed(8675309);
		aincrad.createWorld();

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

		PlatinumMainCommand worlds = new CommandWorlds("worlds", "platinum.command.worlds", true, "Manage worlds",
				"/worlds help (page)");
		worlds.addChildCommand(
				new WorldsGo("go", "platinum.command.worlds.go", true, "Teleport to a world", "/worlds go <world>"));
		getCommand("Worlds").setExecutor(worlds);

	}

	public void enableListeners()
	{

		getServer().getPluginManager().registerEvents(new ListenerTest(), this);

	}

}
