package Maxiron;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Handler(), this);
        getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);
        this.getLogger().info("MinePlugin-Dimension is enable");
        // listen events
        // calls on server start (end of reload)
    }

    @Override
    public void onDisable() {
        this.getLogger().info("MinePlugin-Dimension is disable");
    }
}
