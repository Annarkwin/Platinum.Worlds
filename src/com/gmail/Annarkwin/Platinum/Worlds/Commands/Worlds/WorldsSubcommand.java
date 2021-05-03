package com.gmail.Annarkwin.Platinum.Worlds.Commands.Worlds;

import org.bukkit.command.CommandSender;

import com.gmail.Annarkwin.Platinum.API.MainCommand;
import com.gmail.Annarkwin.Platinum.API.Subcommand;

public class WorldsSubcommand implements Subcommand {

	private String description = "Set mount max health";
	private MainCommand main;
	private String name = "health";
	private String permission = "platinum.mount.health";
	private boolean playeronly = true;
	private String usage = "/mount health <#>";

	public WorldsSubcommand(MainCommand maincommand) {
		main = maincommand;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public MainCommand getMainCommand() {
		return main;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPermission() {
		return permission;
	}

	@Override
	public String getUsage() {
		return usage;
	}

	@Override
	public boolean isPlayerOnly() {
		return playeronly;
	}

	@Override
	public void run(CommandSender sender, String[] args) {
		
	}
}
