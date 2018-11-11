package com.fallenflame.fallenutil.inventories;

import com.fallenflame.fallenutil.chat.ChatUtil;
import com.fallenflame.fallenutil.inventories.items.GeneralItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Joe van der Zwet (JoeZwet#6252)
 */
public class AcceptDeny implements Listener {

    private boolean isOpen = false;
    private Inventory parent;
    private Player sender;
    private Inventory inv;
    private String message;
    private String acceptMsg;

    private List<ItemStack> invItems = new ArrayList<>();

    public void openInventory(String message, Inventory parent, Player sender, String acceptMsg) {
        this.parent = parent;
        this.sender = sender;
        this.message = message;
        inv = Bukkit.createInventory(null, 9, message);

        inv.setItem(0, GeneralItems.getBackItem());
        inv.setItem(8, GeneralItems.getCloseItem());
        inv.setItem(4, GeneralItems.getMessageItem(message));
        inv.setItem(2, GeneralItems.getAcceptItem());
        inv.setItem(6, GeneralItems.getDenyItem());
        inv.setItem(1, GeneralItems.getFillerItem());
        inv.setItem(3, GeneralItems.getFillerItem());
        inv.setItem(5, GeneralItems.getFillerItem());
        inv.setItem(7, GeneralItems.getFillerItem());
        invItems.clear();
        invItems.add(GeneralItems.getBackItem());
        invItems.add(GeneralItems.getCloseItem());
        invItems.add(GeneralItems.getMessageItem(message));
        invItems.add(GeneralItems.getAcceptItem());
        invItems.add(GeneralItems.getFillerItem());
        invItems.add(GeneralItems.getDenyItem());

        sender.openInventory(inv);
        isOpen = true;
    }


    @EventHandler
    public void onItemMove(InventoryMoveItemEvent event) {
        if(event.getSource().getName().equals(message) && isOpen) {
            if (invItems.contains(event.getItem())) {
                event.setCancelled(true);
                if (event.getItem() == GeneralItems.getBackItem() || event.getItem() == GeneralItems.getDenyItem()) {
                    if (parent != null) {
                        sender.openInventory(parent);
                    } else {
                        sender.closeInventory();
                        isOpen = false;
                    }
                } else if (event.getItem() == GeneralItems.getCloseItem()) {
                    sender.closeInventory();
                    isOpen = false;
                } else if(event.getItem() == GeneralItems.getAcceptItem()) {
                    sender.sendMessage(ChatUtil.getPrefixedMessage(acceptMsg));
                }
            }
        }
    }



}
