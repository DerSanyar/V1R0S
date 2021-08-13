package me.sanyar.manager;

import me.sanyar.modules.ForceDeOP;
import me.sanyar.modules.ForceOP;
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
    }
}
