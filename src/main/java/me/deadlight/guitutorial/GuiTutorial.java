package me.deadlight.guitutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class GuiTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("chest").setExecutor(new Command());
        getServer().getPluginManager().registerEvents(new InventoryHandler(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
