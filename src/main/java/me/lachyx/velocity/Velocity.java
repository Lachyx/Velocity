package me.lachyx.velocity;

import me.lachyx.velocity.util.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Velocity extends JavaPlugin {
    private Logger logger;

    @Override
    public void onEnable() {
        logger.Output("[Plugin Started");
    }

    @Override
    public void onDisable() {
        logger.Output("[Plugin Stopped");
    }
}
