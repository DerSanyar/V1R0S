package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.entity.Player;

public class GetVanishedPlayers extends VModule {

    public GetVanishedPlayers() {
        super("getvanishedplayers", "Getter for vanished players");
    }

    Vanish v;

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 1){

            player.sendMessage(Main.getInstance().getPrefix()+"§aList of vanished players!");
            player.sendMessage("");

            for(Player v : v.vanish){
                player.sendMessage("§2- §6"+v.getName());
            }
            if(v.vanish.size() == 1) {
                player.sendMessage("\n"+Main.getInstance().getPrefix()+"§6"+v.vanish.size()+" §a players");
            }else{
                player.sendMessage("\n"+Main.getInstance().getPrefix()+"§6"+v.vanish.size()+" §a players");
            }


        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
