package pyr.solutions.allkingplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OpMessage implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();
        String message = e.getMessage();
        if(player.isOp()){
            e.setMessage(ChatColor.YELLOW + message);
        }
    }
}
