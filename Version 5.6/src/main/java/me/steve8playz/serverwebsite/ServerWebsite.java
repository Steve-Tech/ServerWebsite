package me.steve8playz.serverwebsite;

import org.bstats.bukkit.MetricsLite;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerWebsite extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ServerWebsite v5.6 has been Enabled");
        MetricsLite metrics = new MetricsLite(this);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerWebsite v5.6 is Shutting Down");
        saveConfig();
        getLogger().info("ServerWebsite v5.6 has been Disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("web") || cmd.getName().equalsIgnoreCase("site") || cmd.getName().equalsIgnoreCase("website")) {

            if ((getConfig().getBoolean("enable-web-command")) && (sender.hasPermission("ServerWebsite.sites.website"))) {
                if (!getConfig().getBoolean("web-custom-message")) {
                    if (!getConfig().getBoolean("underline-url")) {
                        sender.sendMessage("Our Website: " + getConfig().getString("website-url"));
                    } else {
                        sender.sendMessage("Our Website: " + ChatColor.UNDERLINE + getConfig().getString("website-url"));
                    }
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Website");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Website", "ServerWebsite.admin.debug.message");
                    }
                }

                if (getConfig().getBoolean("web-custom-message")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', (getConfig().getStringList("web-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Website");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Website", "ServerWebsite.admin.debug.message");
                    }
                }
            } else {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                    getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Website when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.DARK_RED + " Has asked for the Server's Website when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if (cmd.getName().equalsIgnoreCase("vote")) {

            if ((getConfig().getBoolean("enable-vote-command")) && (sender.hasPermission("ServerWebsite.sites.vote"))) {
                if (!getConfig().getBoolean("vote-custom-message")) {
                    if (!getConfig().getBoolean("underline-url")) {
                        sender.sendMessage("Voting Link: " + getConfig().getString("vote-url"));
                    } else {
                        sender.sendMessage("Voting Link: " + ChatColor.UNDERLINE + getConfig().getString("vote-url"));
                    }
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Voting Link");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Voting Link", "ServerWebsite.admin.debug.message");
                    }
                }

                if (getConfig().getBoolean("vote-custom-message")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', (getConfig().getStringList("vote-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Voting Link");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Voting Link", "ServerWebsite.admin.debug.message");
                    }
                }
            } else {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                    getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Voting Link when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.DARK_RED + " Has asked for the Server's Voting Link when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if (cmd.getName().equalsIgnoreCase("shop")) {

            if ((getConfig().getBoolean("enable-shop-command")) && (sender.hasPermission("ServerWebsite.sites.shop"))) {
                if (!getConfig().getBoolean("shop-custom-message")) {
                    if (!getConfig().getBoolean("underline-url")) {
                        sender.sendMessage("Shop URL: " + getConfig().getString("shop-url"));
                    } else {
                        sender.sendMessage("Shop URL: " + ChatColor.UNDERLINE + getConfig().getString("shop-url"));
                    }

                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Shop URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Shop URL", "ServerWebsite.admin.debug.message");
                    }
                }

                if (getConfig().getBoolean("shop-custom-message")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', (getConfig().getStringList("shop-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Shop URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Shop URL", "ServerWebsite.admin.debug.message");
                    }
                }
            } else {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                    getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Shop URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.DARK_RED + " Has asked for the Server's Shop URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if (cmd.getName().equalsIgnoreCase("forum")) {

            if ((getConfig().getBoolean("enable-forum-command")) && (sender.hasPermission("ServerWebsite.sites.forum"))) {
                if (!getConfig().getBoolean("forum-custom-message")) {
                    if (!getConfig().getBoolean("underline-url")) {
                        sender.sendMessage("Forum URL: " + getConfig().getString("forum-url"));
                    } else {
                        sender.sendMessage("Forum URL: " + ChatColor.UNDERLINE + getConfig().getString("forum-url"));
                    }
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Forum URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Forum URL", "ServerWebsite.admin.debug.message");
                    }
                }

                if (getConfig().getBoolean("forum-custom-message")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', (getConfig().getStringList("forum-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Forum URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Forum URL", "ServerWebsite.admin.debug.message");
                    }
                }
            } else {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                    getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Forum URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.DARK_RED + " Has asked for the Server's Forum URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if (cmd.getName().equalsIgnoreCase("online-map")) {

            if ((getConfig().getBoolean("enable-online-map-command")) && (sender.hasPermission("ServerWebsite.sites.online-map"))) {
                if (!getConfig().getBoolean("online-map-custom-message")) {
                    if (!getConfig().getBoolean("underline-url")) {
                        sender.sendMessage("Online Map URL: " + getConfig().getString("online-map-url"));
                    } else {
                        sender.sendMessage("Online Map URL: " + ChatColor.UNDERLINE + getConfig().getString("online-map-url"));
                    }
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Online Map URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Online Map URL", "ServerWebsite.admin.debug.message");
                    }
                }

                if (getConfig().getBoolean("online-map-custom-message")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', (getConfig().getStringList("online-map-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Online Map URL");
                        Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.RED + " Has asked for the Server's Online Map URL", "ServerWebsite.admin.debug.message");
                    }
                }
            } else {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                    getLogger().info(((Player) sender).getDisplayName() + " Has asked for the Server's Online Map URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player) sender).getDisplayName() + ChatColor.DARK_RED + " Has asked for the Server's Online Map URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if ((cmd.getName().equalsIgnoreCase("ServerWebsite")) && (sender.hasPermission("ServerWebsite.admin"))) {
            if (args.length == 1) {
                if ((args[0].equalsIgnoreCase("reload")) && (sender.hasPermission("ServerWebsite.admin.reload"))) {
                    Bukkit.getPluginManager().getPlugin("ServerWebsite").reloadConfig();
                    sender.sendMessage(ChatColor.GOLD + "[ServerWebsite] Reloaded the config!");
                }
                if ((args[0].equalsIgnoreCase("debug")) && (sender.hasPermission("ServerWebsite.admin.debug"))) {
                    if ((getConfig().getBoolean("debug")) && (sender instanceof Player)) {
                        getConfig().set("debug", false);
                        sender.sendMessage(ChatColor.GOLD + "[ServerWebsite] No longer telling console and operators when someone types the commands");
                    } else {
                        getConfig().set("debug", true);
                        sender.sendMessage(ChatColor.GOLD + "[ServerWebsite] Now telling console and operators when someone types the commands");
                    }
                }
                if ((!(args[0].equalsIgnoreCase("reload") || (args[0].equalsIgnoreCase("debug")))) && (sender.hasPermission("ServerWebsite.admin"))) {
                    sender.sendMessage("Usage: /ServerWebsite <reload/debug>");
                }
            } else {
                if (sender.hasPermission("ServerWebsite.admin")) {
                    sender.sendMessage("Usage: /ServerWebsite <reload/debug>");

                }
            }
        }

        {
            return true;
        }
    }
}