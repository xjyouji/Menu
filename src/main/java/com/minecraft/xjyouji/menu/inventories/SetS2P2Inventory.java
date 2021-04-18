package com.minecraft.xjyouji.menu.inventories;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class SetS2P2Inventory {

    public static void setInv(Player p){
        PlayerInventory inv = p.getInventory();
        inv.addItem(new ItemStack(Material.DIAMOND_SWORD));
        inv.addItem(new ItemStack(Material.ENDER_PEARL,16));
        Potion pot = new Potion(PotionType.INSTANT_HEAL,2,true);
        ItemStack item = pot.toItemStack(1);
        for(int i = 0;i <= 33;i++){
            inv.addItem(item);
        }


    }
}
