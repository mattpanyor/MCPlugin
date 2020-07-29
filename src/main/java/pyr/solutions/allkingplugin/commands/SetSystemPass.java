package pyr.solutions.allkingplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pyr.solutions.allkingplugin.AllKingPlugin;

import java.util.Base64;

public class SetSystemPass implements CommandExecutor {
    Plugin plugin = AllKingPlugin.getPlugin(AllKingPlugin.class);


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(command.getName().equals("setsyspass")
                && sender.isOp()){

            String newpass = Base64.getEncoder().encodeToString(args[0].getBytes());
            plugin.getConfig().set("Password", newpass);
            plugin.saveConfig();

            return true;
        }

        return false;
    }
}
