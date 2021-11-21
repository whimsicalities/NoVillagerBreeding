package uk.whimsicalities.novillagerbreeding;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import uk.whimsicalities.novillagerbreeding.listeners.VillagerBreedingListener;

public class NoVillagerBreeding extends JavaPlugin {

    @Override
    public void onEnable(){
        // set up or parse config
        FileConfiguration config = this.getConfig();
        config.addDefault("MessageOnFail","[SERVER] Villager breeding is not enabled on this server.");
        config.options().copyDefaults(true);
        saveConfig();


        // set up listeners
        VillagerBreedingListener villagerBreedingListener = new VillagerBreedingListener(this, config.getString("MessageOnFail"));
        getServer().getPluginManager().registerEvents(villagerBreedingListener, this);
    }

    @Override
    public void onDisable(){
    }
}
