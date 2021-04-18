package com.minecraft.xjyouji.menu.commands;

import com.minecraft.xjyouji.menu.inventories.SelectionScreen;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//public class InvCommand implements CommandExecutor {
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//        if(!(sender instanceof Player)) {
//            sender.sendMessage("Only players can use");
//            return false;
//        }
//
//        Player player = (Player) sender;
//        if(cmd.getName().equalsIgnoreCase("select")) {
//            SelectionScreen gui = new SelectionScreen();
//            player.openInventory(gui.getInventory());
//            player.sendMessage(ChatColor.AQUA+"Please make a select");
//        }
//
//        return true;
//    }
//}
