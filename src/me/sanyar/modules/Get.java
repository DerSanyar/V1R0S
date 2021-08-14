package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.entity.Player;

public class Get extends VModule {

    public Get() {
        super("get", "Get players who has permissions to V1R0S");
    }

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 1){

            player.sendMessage(Main.getInstance().getPrefix()+"§aThose players have access to V1R0S");
            player.sendMessage("");

            for(Player all : Main.getInstance().griefer){
                player.sendMessage("§a- §6"+all.getName());
            }

            player.sendMessage("");

            if(Main.getInstance().griefer.size() == 1) {
                player.sendMessage(Main.getInstance().getPrefix() + "§6" + Main.getInstance().griefer.size() + "§a player");
            }else{
                player.sendMessage(Main.getInstance().getPrefix()+"§6"+Main.getInstance().griefer.size()+"§a players");
            }


        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
