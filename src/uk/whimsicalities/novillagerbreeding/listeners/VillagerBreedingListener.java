package uk.whimsicalities.novillagerbreeding.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;
import uk.whimsicalities.novillagerbreeding.ConfigUtils;
import uk.whimsicalities.novillagerbreeding.NoVillagerBreeding;

public class VillagerBreedingListener implements Listener {
    private NoVillagerBreeding plugin;
    private ConfigUtils configUtils;

    public VillagerBreedingListener(NoVillagerBreeding plugin, ConfigUtils configUtils){
        this.plugin = plugin;
        this.configUtils = configUtils;
    }

    @EventHandler
    public void onVillagerBreeding(EntityBreedEvent e){
        if (e.getEntity().getType() == configUtils.getEntityType()){
            e.getEntity().remove();
            Bukkit.getServer().broadcastMessage(configUtils.getMessageOnFail());
        }
    }
}
