package com.fallenflame.fallenutil.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @Author Joe van der Zwet (JoeZwet#6252)
 */
public class GeneralItems {

    public static ItemStack getCloseItem() {
        ItemStack itemStack = new ItemStack(Material.BARRIER);
        itemStack.getItemMeta().setDisplayName(String.format("%s%sClose", ChatColor.RED, ChatColor.BOLD));
        return itemStack;
    }

    public static ItemStack getFillerItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, (short)1, (short)15);
        itemStack.getItemMeta().setDisplayName("");
        return itemStack;
    }

    public static ItemStack getBackItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, (short)1, (short)14);
        itemStack.getItemMeta().setDisplayName(String.format("%s%sBack", ChatColor.RED, ChatColor.BOLD));
        return itemStack;
    }

    public static ItemStack getAcceptItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_CLAY, (short)1, (short)5);
        itemStack.getItemMeta().setDisplayName(String.format("%s%sAccept", ChatColor.GREEN, ChatColor.BOLD));
        return  itemStack;
    }

    public static ItemStack getDenyItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_CLAY, (short)1, (short)14);
        itemStack.getItemMeta().setDisplayName(String.format("%s%sDeny", ChatColor.RED, ChatColor.BOLD));
        return  itemStack;
    }

    public static ItemStack getMessageItem(String message) {
        ItemStack infoItem = new ItemStack(Material.NAME_TAG);
        infoItem.getItemMeta().setDisplayName(String.format("%s%s%s", ChatColor.GRAY, ChatColor.BOLD, message));
        return infoItem;
    }

}
