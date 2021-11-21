package uk.whimsicalities.novillagerbreeding.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;
import uk.whimsicalities.novillagerbreeding.NoVillagerBreeding;

public class VillagerBreedingListener implements Listener {
    private NoVillagerBreeding plugin;
    private String alertMessage;

    public VillagerBreedingListener(NoVillagerBreeding p, String messageOnFail){
        this.plugin = p;
        this.alertMessage = messageOnFail;
    }

    @EventHandler
    public void onVillagerBreeding(EntityBreedEvent e){
        if (e.getEntity().getType() == EntityType.PIG){
            e.getEntity().remove();
            Bukkit.getServer().broadcastMessage(alertMessage);
        }
    }
}
