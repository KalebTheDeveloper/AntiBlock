package me.doobles;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class RandomTP extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getConfig().options().copyDefaults(true);
		saveConfig();
	}

	@Override
	public void onDisable() {
		saveConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		if (cmd.getName().equalsIgnoreCase("shorttp") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location originalLocation = player.getLocation();
			
			Random random = new Random();
			
			Location teleportLocation = null;
			
			int x = random.nextInt(this.getConfig().getInt("short-tp")) + 1;
			int y = 150;
			int z = random.nextInt(this.getConfig().getInt("short-tp")) + 1;
			
			boolean isOnLand = false;
			
			while (isOnLand == false) {

				teleportLocation = new Location(player.getWorld(), x, y, z);
				
				if (teleportLocation.getBlock().getType() != Material.AIR) {
					isOnLand = true;
				} else y--;
			
			}
			
			player.teleport(new Location(player.getWorld(), teleportLocation.getX(), teleportLocation.getY() + 1, teleportLocation.getZ()));
			
			player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
			
			return true;
			
		} else if (cmd.getName().equalsIgnoreCase("mediumtp") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location originalLocation = player.getLocation();
			
			Random random = new Random();
			
			Location teleportLocation = null;
			
			int x = random.nextInt(this.getConfig().getInt("medium-tp")) + 1;
			int y = 150;
			int z = random.nextInt(this.getConfig().getInt("medium-tp")) + 1;
			
			boolean isOnLand = false;
			
			while (isOnLand == false) {

				teleportLocation = new Location(player.getWorld(), x, y, z);
				
				if (teleportLocation.getBlock().getType() != Material.AIR) {
					isOnLand = true;
				} else y--;
			
			}
			
			player.teleport(new Location(player.getWorld(), teleportLocation.getX(), teleportLocation.getY() + 1, teleportLocation.getZ()));
			
			player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
			
			return true;
			
		} else if (cmd.getName().equalsIgnoreCase("fartp") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location originalLocation = player.getLocation();
			
			Random random = new Random();
			
			Location teleportLocation = null;
			
			int x = random.nextInt(this.getConfig().getInt("far-tp")) + 1;
			int y = 150;
			int z = random.nextInt(this.getConfig().getInt("far-tp")) + 1;
			
			boolean isOnLand = false;
			
			while (isOnLand == false) {

				teleportLocation = new Location(player.getWorld(), x, y, z);
				
				if (teleportLocation.getBlock().getType() != Material.AIR) {
					isOnLand = true;
				} else y--;
			
			}
			
			player.teleport(new Location(player.getWorld(), teleportLocation.getX(), teleportLocation.getY() + 1, teleportLocation.getZ()));
			
			player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
			
			return true;
			
		} else if (cmd.getName().equalsIgnoreCase("wild") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location originalLocation = player.getLocation();
			
			Random random = new Random();
			
			Location teleportLocation = null;
			
			int x = random.nextInt(this.getConfig().getInt("wilderness")) + 1;
			int y = 150;
			int z = random.nextInt(this.getConfig().getInt("wilderness")) + 1;
			
			boolean isOnLand = false;
			
			while (isOnLand == false) {

				teleportLocation = new Location(player.getWorld(), x, y, z);
				
				if (teleportLocation.getBlock().getType() != Material.AIR) {
					isOnLand = true;
				} else y--;
			
			}
			
			player.teleport(new Location(player.getWorld(), teleportLocation.getX(), teleportLocation.getY() + 1, teleportLocation.getZ()));
			
			player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
			
			return true;
			
		}
		
		return false;	
		
	}
	
}
