package me.sanyar.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    private final String cprefix = "§7[§cV1R0S§7] ",
            prefix = "§7[§cV1R0S§7] §a§l";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(cprefix+"§aStarting V1R0S");
    }


    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(cprefix+"§cshutting down V1R0S");

    }

    public String getPrefix() {
        return this.prefix;
    }


}
