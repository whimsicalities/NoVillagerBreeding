package uk.whimsicalities.novillagerbreeding.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;
import uk.whimsicalities.novillagerbreeding.NoVillagerBreeding;

public class VillagerBreedingListener implements Listener {
    private NoVillagerBreeding plugin = null;

    public VillagerBreedingListener(NoVillagerBreeding p){
        this.plugin = p;
    }

    @EventHandler
    public void onVillagerBreeding(EntityBreedEvent e){
        if (e.getEntity().getType() == EntityType.VILLAGER){
            e.getEntity().remove();
            Bukkit.getServer().broadcastMessage("[SERVER] Villager breeding is not enabled on this server.");
        }
    }
}
