package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class WhiteList extends VModule {

    public WhiteList() {
        super("whitelist", "Turn the whitelist on or off");
    }

    @Override
    public void onModule(String[] args, Player player) {
        if(args.length == 2){
            switch(args[1]){
                case "on":
                    player.sendMessage(Main.getInstance().getPrefix()+"§aYou turned the Whitelist on!");
                    Bukkit.setWhitelist(true);
                    break;
                case "off":
                    player.sendMessage(Main.getInstance().getPrefix()+"§cYou turned the Whitelist off!");
                    Bukkit.setWhitelist(false);
                break;

                default:
                    player.sendMessage(Main.getInstance().getErrsyn());
            }
        }
    }
}
