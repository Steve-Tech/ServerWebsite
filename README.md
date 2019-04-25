# ServerWebsite ![Spigot API Version](https://img.shields.io/badge/Spigot%20API%20Version-1.13-brightgreen.svg) ![Spiget tested server versions](https://img.shields.io/spiget/tested-versions/13007.svg?label=Tested%20MC%20Versions) ![Spiget Downloads](https://img.shields.io/spiget/downloads/13007.svg?label=Spigot%20Downloads)
A spigot plugin to provide links for your website, shop, forum and/or voting site from your Minecraft Server.
[Download it already compiled here](https://www.spigotmc.org/resources/serverwebsite.13007/).
An extension for Placeholder API is also [available for download here](https://api.extendedclip.com/expansions/serverwebsite-expansion/).
### Commands:
* /serverwebsite <reload/debug>
* /web
* /site
* /website
* /vote
* /shop (could be used with enjin)
* /forum (could be used with enjin)
* /online-map (could be used with the dynmap plugin)
### Permissions:
* /ServerWebsite: ServerWebsite.admin
* /ServerWebsite reload: ServerWebsite.admin.reload
* /ServerWebsite debug: ServerWebsite.admin.debug
* Debug Message: ServerWebsite.admin.debug.message
* /website: ServerWebsite.sites.website
* /web: ServerWebsite.sites.website
* /site: ServerWebsite.sites.website
* /vote: ServerWebsite.sites.vote
* /shop: ServerWebsite.sites.shop
* /forum: ServerWebsite.sites.forum
* /online-map: ServerWebsite.sites.online-map
### The Config:
```yaml
# Default Configuration File for the ServerWebsite Plugin
# Make sure all custom message text is inside ' '
# Example: - 'Custom Text'
# -----
# Enable or Disable commands provided by this plugin here
enable-web-command: true
enable-vote-command: true
enable-shop-command: true
enable-forum-command: true
enable-online-map-command: true
# Insert your server's websites here, the extension for Placeholder API will also read this
website-url: www.example.com
vote-url: www.example.com/vote
shop-url: www.example.com/shop
forum-url: www.example.com/forum
online-map-url: map.example.com:8123
# Underline the URLs (If you're not using custom messages)
underline-url: true
# Tell console and operators when someone types a command provided by this plugin
debug: false
# Enable or Disable custom messages here
web-custom-message: false
vote-custom-message: false
shop-custom-message: false
forum-custom-message: false
online-map-custom-message: false
# Edit custom messages here
web-message:
- '&6@&1===================================================&6@'
- '&6  Our Website: &nwww.example.com'
- '&6@&1===================================================&6@'
vote-message:
- '&6@&1===================================================&6@'
- '&6  Voting Link: &nwww.example.com/vote'
- '&6@&1===================================================&6@'
shop-message:
- '&6@&1===================================================&6@'
- '&6  Shop URL: &nwww.example.com/shop'
- '&6@&1===================================================&6@'
forum-message:
- '&6@&1===================================================&6@'
- '&6  Forum URL: &nwww.example.com/forum'
- '&6@&1===================================================&6@'
online-map-message:
- '&6@&1===================================================&6@'
- '&6  Online Map URL: &nmap.example.com:8123'
- '&6@&1===================================================&6@'
```
This plugin uses [bStats](https://bstats.org/) so I know how my plugin is being used and how I can improve it. You can always opt-out using the config file in the bStats folder. See all the collected data [here](https://bstats.org/plugin/bukkit/ServerWebsite).\
![bStats Servers](https://img.shields.io/bstats/servers/2866.svg) ![bStats Players](https://img.shields.io/bstats/players/2866.svg)
