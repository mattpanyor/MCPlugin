package pyr.solutions.allkingplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import pyr.solutions.allkingplugin.inventories.AdminPanelInventory;

public class AdminPanelHandler implements Listener {

    @EventHandler
    public void onAdminPanelClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equalsIgnoreCase("Admin Panel")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) return;

            AdminPanelInventory ap = new AdminPanelInventory(p);

            if(e.getCurrentItem().equals(ap.getSaturation_apple())){
                PotionEffect saturation = new PotionEffect(PotionEffectType.SATURATION, 100000,255, false, false, false
                );
                p.addPotionEffect(saturation);
            }
            if(e.getCurrentItem().equals(ap.getNight_vision_nether_star())){
                PotionEffect night_vision = new PotionEffect(PotionEffectType.NIGHT_VISION, 100000,1, false, false, false);
                p.addPotionEffect(night_vision);
            }
            if(e.getCurrentItem().equals(ap.getFire_resistance_campfire())){
                PotionEffect fire_resistance = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000,255, false, false, false);
                p.addPotionEffect(fire_resistance);
            }
            if(e.getCurrentItem().equals(ap.getResistance_armor())){
                PotionEffect resistance = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100000,255, false, false, false);
                p.addPotionEffect(resistance);
            }
        }
    }
}
