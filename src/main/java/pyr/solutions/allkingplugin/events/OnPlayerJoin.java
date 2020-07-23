package pyr.solutions.allkingplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import pyr.solutions.allkingplugin.AllKingPlugin;

public class OnPlayerJoin implements Listener {

    Plugin plugin = AllKingPlugin.getPlugin(AllKingPlugin.class);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        player.sendMessage("Üdvözöllek " + ChatColor.GREEN + player.getDisplayName() + ChatColor.RESET + "!");

        String original_motd = plugin.getConfig().getString("MOTD");

        if (original_motd != null) {

            String[] motds = original_motd.split("--");

            player.sendMessage(motds);

        }
    }
}
