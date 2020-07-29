package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && sender.isOp() && command.getName().equals("fly")){

            Player player = (Player) sender;

            if (!player.getAllowFlight()){
                player.setAllowFlight(true);
                player.sendMessage("Flying enabled!");
            } else {
                player.setAllowFlight(false);
                player.sendMessage("Flying disabled!");
            }

        }

        return false;
    }
}
