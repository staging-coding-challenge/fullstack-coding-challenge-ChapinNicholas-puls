package com.ex.groceries.Repos;

import com.ex.groceries.models.groceryList;

import java.util.List;

public interface groceryListRepo {
    List<groceryList> getAll();
    groceryList getGroceryListByID(int id);
    void createGroceryList (groceryList newList);
    void deleteGroceryListByID (int id);


}
