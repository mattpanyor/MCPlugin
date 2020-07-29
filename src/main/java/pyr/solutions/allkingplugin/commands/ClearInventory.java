package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearInventory implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player && sender.isOp() && command.getName().equals("clearinv")){

            Player player = (Player) sender;

            player.getInventory().clear();

            player.sendMessage("Your Inventory is cleared!");

        }
        return false;
    }
}
