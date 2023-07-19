package pyr.solutions.allkingplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player player = e.getEntity();
        Location loc = player.getLocation();
        player.sendMessage(ChatColor.GOLD + "You have died at: " + ChatColor.GREEN + ChatColor.BOLD + loc.getBlockX() +", " + loc.getBlockY() + ", " + loc.getBlockZ());
    }
}
