package uk.whimsicalities.novillagerbreeding;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;

public class ConfigUtils {

    private NoVillagerBreeding plugin;
    private FileConfiguration config;

    public ConfigUtils(NoVillagerBreeding plugin){
        this.plugin = plugin;
        plugin.saveDefaultConfig();
        this.config = plugin.getConfig();
    }

    public String getMessageOnFail(){
        return config.getString("MessageOnFail");
    }

    public EntityType getEntityType(){
        boolean debugPigMode =  config.getBoolean("DebugPigMode");
        if (debugPigMode) {
            return EntityType.PIG;
        }
        else {
            return EntityType.VILLAGER;
        }
    }

}
