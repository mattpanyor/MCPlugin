package pyr.solutions.allkingplugin.events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class DeOpLeave implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        if (player.isOp()){
            // optional -- deopping self when logging out
            //player.setOp(false);
            player.setGameMode(GameMode.SURVIVAL);
        }
    }
}