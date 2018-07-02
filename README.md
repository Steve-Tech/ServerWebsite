# ServerWebsite
A spigot plugin to provide links for your website, shop, forum and/or voting site from your Minecraft Server.
[Download it already compiled here.](https://www.spigotmc.org/resources/serverwebsite.13007/)
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
# Insert your server's websites here
website-url: www.example.com
vote-url: www.example.com/vote
shop-url: www.example.com/shop
forum-url: www.example.com/forum
online-map-url: map.example.com:8123
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
- '&6*&1===================================================&6*'
- '&6  Our Website: www.example.com'
- '&6*&1===================================================&6*'
vote-message:
- '&6*&1===================================================&6*'
- '&6  Voting Link: www.example.com/vote'
- '&6*&1===================================================&6*'
shop-message:
- '&6*&1===================================================&6*'
- '&6  Shop URL: www.example.com/shop'
- '&6*&1===================================================&6*'
forum-message:
- '&6*&1===================================================&6*'
- '&6  Forum URL: www.example.com/forum'
- '&6*&1===================================================&6*'
online-map-message:
- '&6*&1===================================================&6*'
- '&6  Online Map URL: map.example.com:8123'
- '&6*&1===================================================&6*'
```
