package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Vanish extends VModule {

    public Vanish() {
        super("vanish", "Vanishs you");
    }

    ArrayList<Player> vanish = new ArrayList<>();

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 1){
            if(!vanish.contains(player)){
                vanish.add(player);
                player.sendMessage(Main.getInstance().getPrefix()+"§aYou are vanished now!");

                for(Player other : Bukkit.getOnlinePlayers()){
                    other.hidePlayer(player);
                }

            }else{
                vanish.remove(player);
                player.sendMessage(Main.getInstance().getPrefix()+"§cYou are visible now!");

                for(Player other : Bukkit.getOnlinePlayers()){
                    other.showPlayer(player);
                }
            }

        }else if (args.length == 2){
            Player target = Bukkit.getPlayer(args[1]);
            if(!vanish.contains(target)){
                vanish.add(target);
                player.sendMessage(Main.getInstance().getPrefix()+"§aYou vanished §2"+target.getName());

                for(Player other : Bukkit.getOnlinePlayers()){
                    other.hidePlayer(target);
                }

            }else{
                vanish.remove(target);
                player.sendMessage(Main.getInstance().getPrefix()+"§4"+target.getName()+"§c are visible now!");

                for(Player other : Bukkit.getOnlinePlayers()){
                    other.showPlayer(target);
                }
            }


        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
