package com.ex.groceries.Repos;

public interface groceryListItemsRepo {
    List<groceryListItems> getAllItemsFromList (int listID);
    void addItemToList (int listID, String item, String itemType);
    void deleteItemFromList (int listID, int itemID);
}
