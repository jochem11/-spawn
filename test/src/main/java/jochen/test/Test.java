package jochen.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        new test1(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
