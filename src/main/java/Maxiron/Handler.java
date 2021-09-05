package Maxiron;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.*;

@SuppressWarnings("unused")
public class Handler implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        /* Double a = Lag.getTPS()*10;
        Long b = Math.round(a);
        Double tps = a;*/
        String c;
        Player p = event.getPlayer();
        String s = p.getName();
        World w = p.getWorld();
        String n = w.getName();
        /*if (Lag.getTPS() >= 15){
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
        p.setPlayerListFooter("§atps: "+c+tps);*/
        p.setPlayerListHeader("play2.thedimas.pp.ua");
        switch (n) {
            case "world" -> {
                p.setDisplayName("§a" + s + "§f");
            }
            case "world_nether" -> {
                p.setDisplayName("§4" + s + "§f");
            }
            case "world_the_end" -> {
                p.setDisplayName("§5" + s + "§f");
            }
        }
    }

    @EventHandler
    void  PlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
        String worldName;
        Player p = event.getPlayer();
        String s = p.getName();
        String cs = p.getDisplayName();
        World w = p.getWorld();
        String n = w.getName();
        switch (n) {
            case "world" -> {
                n = "§aверхний мир";
                p.setDisplayName("§a" + s + "§f");
            }
            case "world_nether" -> {
                n = "§4незер";
                p.setDisplayName("§4" + s + "§f");
            }
            case "world_the_end" -> {
                n = "§5край";
                p.setDisplayName("§5" + s + "§f");
            }
        }
        Bukkit.broadcastMessage(cs + "§e перешёл в: " + n);
    }



    /* you can create custom events
    void eventName(EventType event) {
        // code
     }
     eventName can be whatever you want
     EventType is the type of event you want to handle*/

}
