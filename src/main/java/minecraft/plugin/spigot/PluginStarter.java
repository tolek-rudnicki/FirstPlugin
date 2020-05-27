package minecraft.plugin.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginStarter extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(this.getName() + "PLUGIN ENABLED!");
    }
}
