package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class FakeOP extends VModule {

    public FakeOP() {
        super("fakeop", "Fake Op");
    }

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 2){
            Player target = Bukkit.getPlayer(args[1]);

            if(target!=null) {
                player.sendMessage(Main.getInstance().getPrefix() + "§aYou fake-opped §2" + target.getName() + "§a!");
                target.sendMessage("§7§o[Server: Opped " + target.getName() + "]");
            }else{
                player.sendMessage(Main.getInstance().getPlayerNotOnline());
            }
        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
