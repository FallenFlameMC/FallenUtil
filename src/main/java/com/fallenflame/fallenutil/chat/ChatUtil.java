package com.fallenflame.fallenutil.chat;

import org.bukkit.ChatColor;

/**
 * @Author Joe van der Zwet (JoeZwet#6252)
 */
public class ChatUtil {

    public static String getPrefixedMessage(String message) {
        return replaceColorChars("&8\u258C &c&lFallenFlame &8▏ &7") + message;
    }

    public static String replaceColorChars(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
