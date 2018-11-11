package com.fallenflame.fallenutil;

import com.fallenflame.fallenutil.inventories.AcceptDeny;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallenUtil extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new AcceptDeny(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}