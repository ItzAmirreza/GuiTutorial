package me.deadlight.guitutorial;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryHandler implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Special")) {
            Player player = (Player) event.getWhoClicked();

            if (event.getCurrentItem().getType().equals(Material.GOLDEN_APPLE)) {
                //heal bde


                player.setHealth(20.0);
                player.sendMessage("Shoma heal shodid!");
                player.closeInventory();
            } else if (event.getCurrentItem().getType().equals(Material.OAK_WOOD)) {
                //item bde
                ItemStack chob = new ItemStack(Material.OAK_WOOD, 64);
                ItemMeta chonMeta = chob.getItemMeta();
                chonMeta.setDisplayName(ChatColor.GOLD + "Chob haye ziba");
                chob.setItemMeta(chonMeta);
                player.getInventory().addItem(chob);
                player.closeInventory();
                player.sendMessage("omidvaram az chob ha bekhobi estefade koni!");
            }

            event.setCancelled(true);
        }

    }

    @EventHandler
    public void dragEvent(InventoryDragEvent event) {

        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Special")) {
            event.setCancelled(true);
        }

    }






}
