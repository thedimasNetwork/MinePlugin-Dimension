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
        p.setPlayerListHeader("§5play2.thedimas.pp.ua");
        switch (n) {
            case "world" -> {
                p.setPlayerListName("§a" + s + "§r");
                p.setDisplayName("§a" + s + "§r");
            }
            case "world_nether" -> {
                p.setPlayerListName("§4" + s + "§r");
                p.setDisplayName("§4" + s + "§r");
            }
            case "world_the_end" -> {
                p.setPlayerListName("§5" + s + "§r");
                p.setDisplayName("§5" + s + "§r");
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
                n = "§aВерхний мир";
                p.setPlayerListName("§a" + s + "§r");
                p.setDisplayName("§a" + s + "§r");
            }
            case "world_nether" -> {
                n = "§4Незер";
                p.setPlayerListName("§4" + s + "§r");
                p.setDisplayName("§4" + s + "§r");
            }
            case "world_the_end" -> {
                n = "§5Край";
                p.setPlayerListName("§5" + s + "§r");
                p.setDisplayName("§5" + s + "§r");
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
