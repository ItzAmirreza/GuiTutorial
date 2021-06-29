package me.deadlight.guitutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Special");

            ItemStack sibTala = new ItemStack(Material.GOLDEN_APPLE, 1);
            ItemStack woodItem = new ItemStack(Material.OAK_WOOD);
            gui.setItem(11, sibTala);
            gui.setItem(15, woodItem);

            player.openInventory(gui);


        }


        return false;

    }
}
