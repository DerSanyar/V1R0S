package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Cage extends VModule {

    public Cage() {
        super("cage", "Put other players into a cage");
    }

    private ArrayList<Player> cagep = new ArrayList<>();

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 2){
            Player target = Bukkit.getPlayer(args[1]);

            if(target != null){
                if(!cagep.contains(target)){
                    cagep.add(target);
                    player.sendMessage(Main.getInstance().getPrefix()+"§aYou put §2"+target.getName()+"§a into a cage! He can not move now!");
                    target.setWalkSpeed(0F);
                    target.setFlySpeed(-1F);

                    if(target.isFlying()){
                        target.setFlying(false);
                    }
                }else{
                    cagep.remove(target);
                    player.sendMessage(Main.getInstance().getPrefix()+"§4"+target.getName()+"§c He can move now!");
                    target.setWalkSpeed(0F);
                    target.setFlySpeed(0F);
                }

            }else{
                player.sendMessage(Main.getInstance().getPlayerNotOnline());
            }

        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
