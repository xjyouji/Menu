package com.minecraft.xjyouji.menu.events;

import com.minecraft.xjyouji.menu.inventories.SelectionScreen;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static com.minecraft.xjyouji.menu.Menu.Sharp2Prot2List;
import static com.minecraft.xjyouji.menu.inventories.SetS2P2Inventory.setInv;

public class InventoryEvent implements Listener {



    @EventHandler
    public void onClick(InventoryClickEvent e){
        //クリックしたマスにアイテムがないときreturn
        if(e.getCurrentItem() == null){ return; }
        //クリックしたホルダーがSelectionScreenのインスタンスであるとき
        if(e.getClickedInventory().getHolder() instanceof SelectionScreen){
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();

            if(Sharp2Prot2List.contains(player)){
                player.sendMessage(ChatColor.AQUA+"You are in queue already");
                player.closeInventory();
                return;
            }

            if(e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE){
                Sharp2Prot2List.add(player);
                player.sendMessage(ChatColor.AQUA+"queue sharp2prot2");
                player.closeInventory();
                if(Sharp2Prot2List.size() % 2 ==0){
                    Location loc1 = Sharp2Prot2List.get(0).getLocation();
                    Location loc2 = Sharp2Prot2List.get(1).getLocation();
                    loc1.setX(0.0);
                    loc1.setY(4.0);
                    loc1.setZ(0.0);
                    loc2.setX(0.0);
                    loc2.setY(4.0);
                    loc2.setZ(0.0);
                    Sharp2Prot2List.get(0).teleport(loc1);
                    Sharp2Prot2List.get(1).teleport(loc2);
                    Sharp2Prot2List.get(0).getInventory().clear();
                    setInv(Sharp2Prot2List.get(0));
                    Sharp2Prot2List.get(1).getInventory().clear();
                    setInv(Sharp2Prot2List.get(1));
                    Sharp2Prot2List.remove(1);
                    Sharp2Prot2List.remove(0);
                }
            }

            /*if(e.getCurrentItem().getType() == Material.ARROW){
                player.sendMessage(ChatColor.GREEN + "You have selected the accept button");
                player.closeInventory();
            } else if(e.getSlot() == 4){
                player.sendMessage("Please make a selection......");
            }else if (e.getCurrentItem().getType() == Material.WATER){
                player.sendMessage(ChatColor.RED + "You have selected the accept button");
                player.closeInventory();
            }*/

        }
    }
}
