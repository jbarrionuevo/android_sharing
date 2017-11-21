package com.example.sharingapp;

import android.content.Context;

/**
 * Command used to delete pre-existing item.
 */

public class DeleteItemCommand extends Command {
    private ItemList item_list;
    private Item item;
    private Context context;

    public DeleteItemCommand(ItemList item_list, Item item, Context context) {
        this.item_list = item_list;
        this.item = item;
        this.context = context;
    }

    public void execute() {
        item_list.removeItem(item);
        setIsExecuted(item_list.saveItems(context));
        System.out.println("**DeleteItemCommand: deleting items: execute()");
    }
}