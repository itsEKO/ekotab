package org.imeko.ekotabs;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Ekotabs extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register events
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        updateTablist(player);
    }

    private void updateTablist(Player player) {
        String header = ChatColor.GRAY + "[" + ChatColor.RED + "Durham's Private Server" + ChatColor.GRAY + "]";
        String footer = ChatColor.GRAY + "Coded by ImEKO";
        player.setPlayerListHeaderFooter(header, footer);
    }
}

