package me.sanyar.utils;

import org.bukkit.entity.Player;

public class VModule {

    private String command;
    private String desc;

    public VModule(String command, String desc) {
        this.command = command;
        this.desc = desc;
    }

    public void setCommand(String command){
        this.command = command;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCommand() {
        return command;
    }

    public String getDesc() {
        return desc;
    }

    //Events

    public void onModule(String[] args, Player player) {}
}
