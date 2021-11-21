package uk.whimsicalities.novillagerbreeding;

import org.bukkit.plugin.java.JavaPlugin;
import uk.whimsicalities.novillagerbreeding.listeners.VillagerBreedingListener;

public class NoVillagerBreeding extends JavaPlugin {

    private ConfigUtils configUtils;

    @Override
    public void onEnable(){
        configUtils = new ConfigUtils(this);

        VillagerBreedingListener villagerBreedingListener = new VillagerBreedingListener(this, configUtils);
        getServer().getPluginManager().registerEvents(villagerBreedingListener, this);
    }

    @Override
    public void onDisable(){
    }
}
