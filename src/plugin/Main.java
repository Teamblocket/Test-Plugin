
package plugin;

import cn.nukkit.Player;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;

import cn.nukkit.utils.TextFormat;

import cn.nukkit.event.player.PlayerJoinEvent;

public class Main extends PluginBase implements Listener{
    
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getLogger().notice("Test plugin by Angel! First java plugin !");
    }
    
    public void join(PlayerJoinEvent ev){
        this.getServer().broadcastMessasge(ev.getPlayer().getName()." Has joined using Angel first Java Plugin!");
        ev.getPlayer().sendMessage('Test Plugin by ANgel, First Java plugin of mines!');
    }
}
