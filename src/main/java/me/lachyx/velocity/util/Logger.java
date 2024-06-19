package me.lachyx.velocity.util;

import org.bukkit.plugin.java.JavaPlugin;

public final class Logger extends JavaPlugin {

    void Error(String pError) {
        getLogger().severe(pError);
    }

    void Warn(String pWarning) {
        getLogger().warning(pWarning);
    }

    public void Output(String pOutput) {
        getLogger().info(pOutput);
    }
}
