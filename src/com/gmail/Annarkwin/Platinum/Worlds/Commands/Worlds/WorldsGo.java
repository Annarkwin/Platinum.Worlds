package com.gmail.Annarkwin.Platinum.Worlds.Commands.Worlds;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.Annarkwin.Platinum.API.PlatinumCommand;

public class WorldsGo extends PlatinumCommand
{

	public WorldsGo( String name, String permission, boolean player, String description, String usage )
	{

		super(name, permission, player, description, usage);
		// TODO Auto-generated constructor stub

	}

	@Override
	public boolean run( CommandSender sender, String cmdname, String[] args )
	{

		if (args.length > 1)
		{

			World w = Bukkit.getWorld(args[1]);

			if (w != null)
			{

				Player p = (Player) sender;
				p.teleport(w.getSpawnLocation());
				sender.sendMessage("§2[Info]:§f Teleported to world - " + w.getName());

			}
			else
			{

				sender.sendMessage("§2[Error]:§f There is no world loaded with that name");

			}

		}
		else
		{

			sender.sendMessage("§2[Error]:§f You must enter a world name");

		}

		return true;

	}

}
