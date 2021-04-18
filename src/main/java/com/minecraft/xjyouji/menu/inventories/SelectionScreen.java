package com.minecraft.xjyouji.menu.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.enchantments.Enchantment.PROTECTION_ENVIRONMENTAL;

public class SelectionScreen implements InventoryHolder {

    private Inventory inv;

    public SelectionScreen() {
        inv = Bukkit.createInventory(this, 18,"Select Gamemode");
        init();
    }

    private void init() {
        ItemStack sharp2prot2 = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
        ItemMeta s2p2Meta = sharp2prot2.getItemMeta();
        s2p2Meta.addEnchant(PROTECTION_ENVIRONMENTAL,2,true);
        s2p2Meta.setDisplayName("§bSharp2Prot2");
        sharp2prot2.setItemMeta(s2p2Meta);
        inv.setItem(0,sharp2prot2);

        ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE,1, (byte) 1);
        ItemMeta GappleMeta = Gapple.getItemMeta();
        GappleMeta.setDisplayName("§bGapple");
        Gapple.setItemMeta(GappleMeta);
        inv.setItem(1,Gapple);


        //item = createItem("§bSharp2Prot2",Material.DIAMOND_CHESTPLATE);
        //inv.setItem(0,item);
        //Center
        /*List<String> lore = new ArrayList<>();
        lore.add("&7Please select either the accept");
        lore.add("&7or deny button to make a selection!");
        item = createItem("&b&lMake a Selection", Material.BOOK, lore);
        inv.setItem(inv.firstEmpty(), item);

        //Right
        for(int i = 5;i < 9; i++){
            item = createItem("&c&lAccept",Material.WATER, Collections.singletonList("&Denies the request!"));
            inv.setItem(i,item);
        }*/

    }

    /*private ItemStack createItem(String name, Material mat){
        ItemStack item = new ItemStack(mat,1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(PROTECTION_ENVIRONMENTAL,2,true);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }*/

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
