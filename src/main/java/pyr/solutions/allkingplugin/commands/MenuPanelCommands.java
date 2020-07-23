package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pyr.solutions.allkingplugin.inventories.AdminPanelInventory;


public class MenuPanelCommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("ap") && sender instanceof Player && ((Player)sender).isOp()){
            Player player = (Player) sender;

            AdminPanelInventory ap = new AdminPanelInventory(player);

            player.openInventory(ap.getInventory());
        }
        if(command.getName().equals("menu") && sender instanceof Player && ((Player)sender).isOp()){
            Player player = (Player) sender;

            //some logic here...

        }


        return false;
    }
}
