#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info(getName() + " enabled.");
	}
	
	@Override
	public void onDisable() {
		getLogger().info(getName() + " disabled.");
	}
}
