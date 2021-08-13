package me.sanyar.main;

import me.sanyar.events.ChatEvent;
import me.sanyar.manager.ModuleManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Main extends JavaPlugin{

    private static Main INSTANCE = null;

    private final String cprefix = "§7[§cV1R0S§7] ",
            prefix = "§7[§cV1R0S§7] §a§l",
            errsyn = prefix+"§cError - Syntax",
            key = "-sarius";

    public ModuleManager mm;

    public ArrayList<Player> griefer = new ArrayList<>();

    @Override
    public void onEnable() {
        INSTANCE = this;
        this.mm = new ModuleManager();
        Bukkit.getConsoleSender().sendMessage(cprefix+"§aStarting V1R0S");

        mm.init();

        //Event register
        new ChatEvent(this);
    }


    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(cprefix+"§cshutting down V1R0S");

    }

    public static Main getInstance(){
        return INSTANCE;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getKey() {
        return key;
    }

    public String getErrsyn() {
        return errsyn;
    }
}
