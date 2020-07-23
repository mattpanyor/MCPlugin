package pyr.solutions.allkingplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Announcement implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.isOp() && args.length > 0){
            sender.getServer().broadcastMessage(ChatColor.YELLOW + "[SERVER] : " + ChatColor.GREEN + String.join(" ", args));
            return true;
        }

        return false;
    }
}
