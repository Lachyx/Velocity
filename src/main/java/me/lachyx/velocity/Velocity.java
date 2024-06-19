package me.lachyx.velocity;

import org.bukkit.plugin.java.JavaPlugin;

public final class Velocity extends JavaPlugin {
    private Logger logger;

    @Override
    public void onEnable() {
        logger.Output("[Plugin Started");
    }

    @Override
    public void onDisable() {

    }
}
