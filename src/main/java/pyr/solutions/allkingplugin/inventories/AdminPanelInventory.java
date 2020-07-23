package pyr.solutions.allkingplugin.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminPanelInventory {

    private final ItemStack saturation_apple = new ItemStack(Material.APPLE,1);
    private final ItemStack night_vision_nether_star = new ItemStack(Material.NETHER_STAR,1);
    private final ItemStack fire_resistance_campfire = new ItemStack(Material.CAMPFIRE,1);

    private final Inventory adminPanel;

    public AdminPanelInventory(Player player){
        adminPanel = Bukkit.createInventory(player, 9, "Admin Panel");

        ItemMeta item1_meta = saturation_apple.getItemMeta();
        item1_meta.setDisplayName("Saturation");
        saturation_apple.setItemMeta(item1_meta);

        ItemMeta item2_meta = night_vision_nether_star.getItemMeta();
        item2_meta.setDisplayName("Night Vision");
        night_vision_nether_star.setItemMeta(item2_meta);

        ItemMeta item3_meta = fire_resistance_campfire.getItemMeta();
        item3_meta.setDisplayName("Fire Resistance");
        fire_resistance_campfire.setItemMeta(item3_meta);

        adminPanel.addItem(saturation_apple,night_vision_nether_star,fire_resistance_campfire);
    }

    public Inventory getInventory(){
        return adminPanel;
    }

    public ItemStack getSaturation_apple() {
        return saturation_apple;
    }

    public ItemStack getNight_vision_nether_star() {
        return night_vision_nether_star;
    }

    public ItemStack getFire_resistance_campfire() {
        return fire_resistance_campfire;
    }

}
