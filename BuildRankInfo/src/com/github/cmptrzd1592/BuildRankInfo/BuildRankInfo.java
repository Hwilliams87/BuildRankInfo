package com.github.cmptrzd1592.BuildRankInfo;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")
public class BuildRankInfo extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	 
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(cmd.getName().equalsIgnoreCase("rankinfo")){
                if(args[1].equals("member")){
                    sender.sendMessage("To get Member, sign up at forum.citycraft.co.uk and promote yourself using the profile page. More info at /warps ranks");
                }else if(args[1].equals("trusted")){
                    sender.sendMessage("To get Trusted, you need to be at least a Member, be a member of the forums for 10 days, have 10 NON-SPAM posts, and 30 votes for the Build server.");
                }else if(args[1].equals("veteran")){
                    sender.sendMessage("To get Veteran, you need to be at least a Trusted, be a member of the forums for 90 days, have 100 NON-SPAM posts, and 100 votes for the Build server.");
                }else if(args[1].equals("donator")){
                    sender.sendMessage("To get Donator, donate at least 10 Pounds to the Build server.");
                }else if(args[1].equals("donator+")){
                    sender.sendMessage("To get Donator+, donate at least 20 Pounds to the Build server.");
                }else if(args[1].equals("elite")){
                    sender.sendMessage("To get Elite, donate at least 50 Pounds to the Build server.");
                }else if(args[1].equals("potw")){
                    sender.sendMessage("To get POTW or Player of the Week, be an active member of the community and go the extra mile to make everyone feel welcome.");
                }else if(args[1].equals("builder")){
                    sender.sendMessage("To get Builder, participate in one of the periodic building competitions. Note: This rank only lasts while the competition goes on.");
                }else if(args[1].equals("trialmod")){
                    sender.sendMessage("To get TrialMod, send an application to Joebladon and/or Frinni via PM on the forums. Be a productive member of the CityCraft community. Note: sending an application will not guarantee you get TrialMod. You will be picked when they feel you are ready.");
                }else if(args[1].equals("moderator")){
                    sender.sendMessage("To get Moderator, pass your TrialMod period and maintain active Moderator duties.");
                }else if(args[1].equals("admin")){
                    sender.sendMessage("To get Admin, get a special invite from Joebladon.");
                }else if(args[1].equals("owner")){
                    sender.sendMessage("Only Joebladon is the owner. This rank is not attainable.");
                }else if(args[1].equals("help")){
                    sender.sendMessage("To learn about a rank, simply use the command /rankinfo (rank) to find out about how to obtain it.");
                }else{
                    sender.sendMessage("Please use /rankinfo help to learn about how to use this plugin.");
                    }
            } return true;
}
}