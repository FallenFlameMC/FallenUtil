package com.fallenflame.fallenutil.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * @Author Joe van der Zwet (JoeZwet#6252)
 */
public class GeneralItems {

    public static ItemStack getCloseItem() {
        ItemStack itemStack = new ItemStack(Material.BARRIER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(String.format("%s%sClose", ChatColor.RED, ChatColor.BOLD));
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack getFillerItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, (short)1, (short)15);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("");
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack getBackItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, (short)1, (short)14);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(String.format("%s%sBack", ChatColor.RED, ChatColor.BOLD));
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack getAcceptItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_CLAY, (short)1, (short)5);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(String.format("%s%sAccept", ChatColor.GREEN, ChatColor.BOLD));
        itemStack.setItemMeta(itemMeta);
        return  itemStack;
    }

    public static ItemStack getDenyItem() {
        ItemStack itemStack = new ItemStack(Material.STAINED_CLAY, (short)1, (short)14);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(String.format("%s%sDeny", ChatColor.RED, ChatColor.BOLD));
        itemStack.setItemMeta(itemMeta);
        return  itemStack;
    }

    public static ItemStack getMessageItem(String message) {
        ItemStack itemStack = new ItemStack(Material.NAME_TAG);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(String.format("%s%s%s", ChatColor.GRAY, ChatColor.BOLD, message));
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

}
