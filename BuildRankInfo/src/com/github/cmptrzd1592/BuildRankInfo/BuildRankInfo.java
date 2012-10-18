package com.github.cmptrzd1592.BuildRankInfo;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.*;

@SuppressWarnings("unused")
public class BuildRankInfo extends JavaPlugin {
	
	File configFile;
	
	FileConfiguration config;

	@Override
	public void onEnable(){
		getLogger().info("BuildRankInfo has been enabled!");
		configFile = new File(getDataFolder(), "config.yml");
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	
	@Override
	public void onDisable(){
		getLogger().info("BuildRankinfo has been disabled!");
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(cmd.getName().equalsIgnoreCase("rankinfo")){
            	Player player = (Player) sender;
            	if(args.length == 0){
            		player.sendMessage(ChatColor.RED + "ERROR: /rankinfo [rank]");
            		return true;
            	}
            	else if(args[0].equalsIgnoreCase("member")){
                    player.sendMessage(ChatColor.YELLOW + "Member" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.member"));
                }else if(args[0].equalsIgnoreCase("trusted")){
                    player.sendMessage(ChatColor.DARK_GREEN + "Trusted" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.trusted"));
                }else if(args[0].equalsIgnoreCase("veteran")){
                    player.sendMessage(ChatColor.GREEN + "Veteran" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.veteran"));
                }else if(args[0].equalsIgnoreCase("donator")){
                    player.sendMessage(ChatColor.DARK_BLUE + "Donator" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.donator"));
                }else if(args[0].equalsIgnoreCase("donator+")){
                    player.sendMessage(ChatColor.GOLD + "Donator+" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.donatorplus"));
                }else if(args[0].equalsIgnoreCase("elite")){
                    player.sendMessage(ChatColor.AQUA + "Elite" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.elite"));
                }else if(args[0].equalsIgnoreCase("potw")){
                    player.sendMessage(ChatColor.DARK_PURPLE + "POTW or Player of the Week" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.potw"));
                }else if(args[0].equalsIgnoreCase("builder")){
                    player.sendMessage(ChatColor.DARK_PURPLE + "Builder" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.builder"));
                }else if(args[0].equalsIgnoreCase("trialmod")){
                    player.sendMessage(ChatColor.RED + "TrialMod" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.trialmod"));
                }else if(args[0].equalsIgnoreCase("moderator") || args[0].equalsIgnoreCase("mod")){
                    player.sendMessage(ChatColor.RED + "Moderator" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.mod"));
                }else if(args[0].equalsIgnoreCase("admin")){
                    player.sendMessage(ChatColor.DARK_RED + "Admin" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.admin"));
                }else if(args[0].equalsIgnoreCase("owner")){
                    player.sendMessage(ChatColor.DARK_RED + "Owner" + ChatColor.LIGHT_PURPLE + ": " + getConfig().getString("rank.owner"));
                }else if(args[0].equalsIgnoreCase("help")){
                    player.sendMessage(ChatColor.LIGHT_PURPLE + getConfig().getString("rank.help"));
                }
            } return true;
}
}