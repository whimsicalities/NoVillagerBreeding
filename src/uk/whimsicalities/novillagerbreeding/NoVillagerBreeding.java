package uk.whimsicalities.novillagerbreeding;

import org.bukkit.plugin.java.JavaPlugin;
import uk.whimsicalities.novillagerbreeding.listeners.VillagerBreedingListener;

public class NoVillagerBreeding extends JavaPlugin {

    @Override
    public void onEnable(){
        VillagerBreedingListener villagerBreedingListener = new VillagerBreedingListener(this);
        getServer().getPluginManager().registerEvents(villagerBreedingListener, this);
    }

    @Override
    public void onDisable(){
    }
}
