package com.ex.groceries.Services;

import com.ex.groceries.Repos.groceryListItemsRepo;
import com.ex.groceries.Repos.groceryListRepo;
import com.ex.groceries.models.groceryListItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroceryListItemsServiceImpli implements GroceryListItemsService {
    groceryListItemsRepo gListItemsRepo;

    @Autowired
    public void setPostingRepository(groceryListItemsRepo gListItemsRepo) {
        this.gListItemsRepo = gListItemsRepo;
    }

    @Override
    public List<groceryListItem> getAllItemsFromList(int listID) { return gListItemsRepo.getAllItemsFromList(listID);}

    @Override
    public void addItemToList(int listID, String item, String itemType) {gListItemsRepo.addItemToList(listID, item, itemType);}

    @Override
    public void deleteItemFromList(int listID, int itemID) { gListItemsRepo.deleteItemFromList(listID,itemID);}
}
