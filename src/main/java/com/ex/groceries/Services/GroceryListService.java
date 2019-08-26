package com.ex.groceries.Services;

import com.ex.groceries.models.groceryList;

import java.util.List;

public interface GroceryListService {

    List<groceryList> getAll();
    groceryList getGroceryListByID(int id);
    void createGroceryList (groceryList newList);
    void deleteGroceryListByID (int id);
}
