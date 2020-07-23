package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pyr.solutions.allkingplugin.AllKingPlugin;

public class ReloadConfig implements CommandExecutor {

    Plugin plugin = AllKingPlugin.getPlugin(AllKingPlugin.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (command.getName().equals("reloadconfig") && ((Player)sender).isOp()){
            plugin.reloadConfig();
            return true;
        }
        return false;
    }

}
