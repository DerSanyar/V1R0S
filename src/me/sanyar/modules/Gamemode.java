package me.sanyar.modules;

import me.sanyar.main.Main;
import me.sanyar.utils.VModule;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class Gamemode extends VModule {

    public Gamemode() {
        super("gamemode", "Switch gamemode");
    }

    @Override
    public void onModule(String[] args, Player player) {


        if(args.length == 2){
            try {
                int mode = Integer.parseInt(args[1]);

                switch(mode){
                    case 0:

                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(Main.getInstance().getPrefix()+"§aYou switched your gamemode to §6"+player.getGameMode().name());

                        break;
                    case 1:

                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(Main.getInstance().getPrefix()+"§aYou switched your gamemode to §6"+player.getGameMode().name());

                        break;
                    case 2:

                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(Main.getInstance().getPrefix()+"§aYou switched your gamemode to §6"+player.getGameMode().name());
                        break;
                    case 3:
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(Main.getInstance().getPrefix()+"§aYou switched your gamemode to §6"+player.getGameMode().name());

                        break;

                    default:
                        player.sendMessage(Main.getInstance().getErrsyn());

                }
            }catch (Exception e){
                player.sendMessage(Main.getInstance().getErrsyn());
            }




        }else if (args.length == 3){
            Player target = Bukkit.getPlayer(args[2]);

            if(target != null) {
                switch (args[1]) {
                    case "0":
                        target.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(Main.getInstance().getPrefix() + "§aYou switched the gamemode from §2" + target.getName() + " §ato §6" + player.getGameMode().name());

                        break;
                    case "1":

                        target.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(Main.getInstance().getPrefix() + "§aYou switched the gamemode from §2" + target.getName() + " §ato §6" + player.getGameMode().name());

                        break;
                    case "2":

                        target.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(Main.getInstance().getPrefix() + "§aYou switched the gamemode from §2" + target.getName() + " §ato §6" + player.getGameMode().name());
                        break;
                    case "3":
                        target.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(Main.getInstance().getPrefix() + "§aYou switched the gamemode from §2" + target.getName() + " §ato §6" + player.getGameMode().name());

                        break;

                    default:
                        player.sendMessage(Main.getInstance().getErrsyn());

                }

            }else{
                player.sendMessage(Main.getInstance().getPlayerNotOnline());
            }


        }else{
            player.sendMessage(Main.getInstance().getErrsyn());
        }
    }
}
