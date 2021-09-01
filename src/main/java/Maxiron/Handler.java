package Maxiron;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.io.ObjectInputFilter;
import java.util.Objects;

@SuppressWarnings("unused")
public class Handler implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        FLoat tps = Math.round(Lag.getTPS())
        String c;
        Player p = event.getPlayer();
        String s = p.getName();
        World w = p.getWorld();
        String n = w.getName();
        if (Lag.getTPS() >= 15){
            c = "§a";
        }
        else if (15 > tps && 10 <= tps){
            c = "§e";
        }
        else if (10 > tps && 3 <= tps){
            c = "§4";
        }
        else {
            c = "§0";
        }
        p.setPlayerListFooter("§atps: "+c+tps);
        p.setPlayerListHeader("play2.thedimas.pp.ua");
        if (n.equals("world")){
            p.setPlayerListName("§a"+s);
            p.setDisplayname("§a"+s)
            return;
        }
        else if (n.equals("world_nether")){
            p.setPlayerListName("§4"+s);
            return;
        }
        else if (n.equals("world_the_end")) {
            p.setPlayerListName("§5"+s);
            return;
        }
    }

    @EventHandler
    void  PlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
        String worldName;
        Player p = event.getPlayer();
        String s = p.getDisplayName();
        World w = p.getWorld();
        String n = w.getName();
        if (n.equals("world")){
            n = "§aверхний мир";
            p.setPlayerListName("§a"+s);
        }
        else if (n.equals("world_nether")){
            n = "§4незер";
            p.setPlayerListName("§4"+s);
        }
        else if (n.equals("world_the_end")) {
            n = "§5край";
            p.setPlayerListName("§5"+s);
        }
        Bukkit.broadcastMessage("§e" + s + " перешёл в: " + n);
    }



    /* you can create custom events
    void eventName(EventType event) {
        // code
     }
     eventName can be whatever you want
     EventType is the type of event you want to handle*/

}
