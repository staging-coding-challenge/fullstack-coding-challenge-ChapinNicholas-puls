package com.ex.groceries.Services;

import com.ex.groceries.models.groceryListItem;

import java.util.List;

public interface GroceryListItemsService {
    List<groceryListItem> getAllItemsFromList (int listID);
    void addItemToList (int listID, String item, String itemType);
    void deleteItemFromList (int listID, int itemID);
}
