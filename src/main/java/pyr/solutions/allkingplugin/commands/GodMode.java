package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodMode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(command.getName().equals("god") && sender instanceof Player){
            Player player = (Player) sender;
            if (player.isOp()){
                if (!player.isInvulnerable()){
                    player.setInvulnerable(true);
                    player.sendMessage("You are now invulnerable!");
                }else {
                    player.setInvulnerable(false);
                    player.sendMessage("You are now vulnerable!");
                }
            } else {
                player.sendMessage("Nice Try!");
            }
            return true;
        }
        return false;
    }

}
