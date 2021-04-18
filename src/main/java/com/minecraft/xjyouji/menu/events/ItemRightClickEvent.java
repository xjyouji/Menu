package com.minecraft.xjyouji.menu.events;

import com.minecraft.xjyouji.menu.inventories.SelectionScreen;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemRightClickEvent implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event){
        if(event.getItem()==null){return;}
        if(String.valueOf(event.getAction()).equalsIgnoreCase("RIGHT_CLICK_BLOCK") || String.valueOf(event.getAction()).equalsIgnoreCase("RIGHT_CLICK_AIR")){
            if(event.getItem().getTypeId() == 267){
                event.setCancelled(true);
                SelectionScreen gui = new SelectionScreen();
                event.getPlayer().openInventory(gui.getInventory());
            }
        }
    }

}
