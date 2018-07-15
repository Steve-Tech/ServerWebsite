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
        getLogger().info("ServerWebsite v5.5 has been Enabled");
        MetricsLite metrics = new MetricsLite(this);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerWebsite v5.5 is Shutting Down");
        saveConfig();
        getLogger().info("ServerWebsite v5.5 has been Disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(getConfig().getBoolean("enable-web-command")) {
            if(!getConfig().getBoolean("web-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("web") || cmd.getName().equalsIgnoreCase("site") || cmd.getName().equalsIgnoreCase("website")) {
                    if(sender.hasPermission("ServerWebsite.sites.website")) {
                        sender.sendMessage("Our Website: " + ChatColor.translateAlternateColorCodes ('&', getConfig().getString("website-url")));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Website");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Website", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }

            if(getConfig().getBoolean("web-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("web") || cmd.getName().equalsIgnoreCase("site") || cmd.getName().equalsIgnoreCase("website")) {
                    if(sender.hasPermission("ServerWebsite.sites.website")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes ('&', (getConfig().getStringList("web-message").toString().replace("[", "").replace("]", "").replace(", ", ""))));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Website");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Website", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }
        } else {
            if(cmd.getName().equalsIgnoreCase("web") || cmd.getName().equalsIgnoreCase("site") || cmd.getName().equalsIgnoreCase("website")) {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if(getConfig().getBoolean("debug")) {
                    getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Website when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.DARK_RED +" Has asked for the Server's Website when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if(getConfig().getBoolean("enable-vote-command")) {
            if(!getConfig().getBoolean("vote-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("vote")) {
                    if(sender.hasPermission("ServerWebsite.sites.vote")) {
                        sender.sendMessage("Voting Link: " + ChatColor.translateAlternateColorCodes ('&', getConfig().getString("vote-url")));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Voting Link");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Voting Link", "ServerWebsite.admin.debug.message");

                        }
                    }
                }
            }

            if(getConfig().getBoolean("vote-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("vote")) {
                    if(sender.hasPermission("ServerWebsite.sites.vote")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes ('&', (getConfig().getStringList("vote-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Voting Link");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Voting Link", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }
        } else {
            if(cmd.getName().equalsIgnoreCase("vote")) {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if(getConfig().getBoolean("debug")) {
                    getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Voting Link when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.DARK_RED +" Has asked for the Server's Voting Link when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if(getConfig().getBoolean("enable-shop-command")) {
            if(!getConfig().getBoolean("shop-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("shop")) {
                    if(sender.hasPermission("ServerWebsite.sites.shop")) {
                        sender.sendMessage("Shop URL: " + ChatColor.translateAlternateColorCodes ('&', getConfig().getString("shop-url")));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Shop URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Shop URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }

            if(getConfig().getBoolean("shop-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("shop")) {
                    if(sender.hasPermission("ServerWebsite.sites.shop")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes ('&', (getConfig().getStringList("shop-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Shop URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Shop URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }
        } else {
            if(cmd.getName().equalsIgnoreCase("shop")) {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if(getConfig().getBoolean("debug")) {
                    getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Shop URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.DARK_RED +" Has asked for the Server's Shop URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if(getConfig().getBoolean("enable-forum-command")) {
            if(!getConfig().getBoolean("forum-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("forum")) {
                    if(sender.hasPermission("ServerWebsite.sites.forum")) {
                        sender.sendMessage("Forum URL: " + ChatColor.translateAlternateColorCodes ('&', getConfig().getString("forum-url")));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Forum URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Forum URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }

            if(getConfig().getBoolean("forum-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("forum")) {
                    if(sender.hasPermission("ServerWebsite.sites.forum")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes ('&', (getConfig().getStringList("forum-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Forum URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Forum URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }
        } else {
            if(cmd.getName().equalsIgnoreCase("forum")) {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if(getConfig().getBoolean("debug")) {
                    getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Forum URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.DARK_RED +" Has asked for the Server's Forum URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if(getConfig().getBoolean("enable-online-map-command")) {
            if(!getConfig().getBoolean("forum-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("online-map")) {
                    if(sender.hasPermission("ServerWebsite.sites.online-map")) {
                        sender.sendMessage("Map URL: " + ChatColor.translateAlternateColorCodes ('&', getConfig().getString("online-map-url")));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Online Map URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Online Map URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }

            if(getConfig().getBoolean("online-map-custom-message")) {
                if(cmd.getName().equalsIgnoreCase("online-map")) {
                    if(sender.hasPermission("ServerWebsite.sites.online-map")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes ('&', (getConfig().getStringList("online-map-message").toString().replace("[", "").replace("]", "").replace(", ", "\n"))));
                        if(getConfig().getBoolean("debug")) {
                            getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Online Map URL");
                            Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.RED +" Has asked for the Server's Online Map URL", "ServerWebsite.admin.debug.message");
                        }
                    }
                }
            }
        } else {
            if(cmd.getName().equalsIgnoreCase("online-map")) {
                sender.sendMessage("Disabled command. Type \"/help\" for help.");
                if(getConfig().getBoolean("debug")) {
                    getLogger().info(((Player)sender).getDisplayName() + " Has asked for the Server's Online Map URL when it is Disabled");
                    Bukkit.broadcast(ChatColor.GOLD + "[ServerWebsite] " + ((Player)sender).getDisplayName() + ChatColor.DARK_RED +" Has asked for the Server's Online Map URL when it is Disabled", "ServerWebsite.admin.debug.message");
                }
            }
        }

        if(cmd.getName().equalsIgnoreCase("ServerWebsite")) {
            if(args.length == 1) {
                if (!(args[0].equalsIgnoreCase("reload") || (args[0].equalsIgnoreCase("debug")))) {
                    if(sender.hasPermission("ServerWebsite.admin")) {
                        sender.sendMessage("Usage: /ServerWebsite <reload/debug>");

                    }
                }

                if (args[0].equalsIgnoreCase("reload")) {
                    if(sender.hasPermission("ServerWebsite.admin.reload")) {
                        Bukkit.getPluginManager().getPlugin("ServerWebsite").reloadConfig();
                        sender.sendMessage(ChatColor.GOLD + "Reloaded the config!");

                    }
                }

                if (args[0].equalsIgnoreCase("debug")) {
                    if(sender.hasPermission("ServerWebsite.admin.debug")) {
                        if (getConfig().getBoolean("debug")) {
                            getConfig().set("debug", false);
                            sender.sendMessage(ChatColor.GOLD + "No longer telling console and operators when someone types the commands");
                        } else {
                            getConfig().set("debug", true);
                            sender.sendMessage(ChatColor.GOLD + "Now telling console and operators when someone types the commands");
                        }

                    }
                }
            } else {
                if(sender.hasPermission("ServerWebsite.admin")) {
                    sender.sendMessage("Usage: /ServerWebsite <reload/debug>");

                }
            }
        }

        {
            return true;
        }
    }
}