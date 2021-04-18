package com.minecraft.xjyouji.menu;

import com.minecraft.xjyouji.menu.events.InventoryEvent;
import com.minecraft.xjyouji.menu.events.ItemRightClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Menu extends JavaPlugin implements Listener {

    public static ArrayList<Player> Sharp2Prot2List = new ArrayList<>();

    @Override
    public void onEnable() {
        //getCommand("select").setExecutor(new InvCommand());
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryEvent(),this);
        Bukkit.getServer().getPluginManager().registerEvents(new ItemRightClickEvent(),this);
    }






}
