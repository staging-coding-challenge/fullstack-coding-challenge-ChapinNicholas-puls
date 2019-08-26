package com.ex.groceries.Repos;

public interface groceryListRepo {
    List<groceryList>getAll();
    groceryList getGroceryListByID(int id);
    void createGroceryList (groceryList newList);
    void deleteGroceryListByID (int id);


}
