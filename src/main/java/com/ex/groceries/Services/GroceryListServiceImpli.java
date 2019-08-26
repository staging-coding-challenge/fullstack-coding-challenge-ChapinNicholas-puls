package com.ex.groceries.Services;

import com.ex.groceries.Repos.groceryListRepo;
import com.ex.groceries.models.groceryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GroceryListServiceImpli implements  GroceryListService {

     groceryListRepo gListRepo;

    @Autowired
    public void setPostingRepository(groceryListRepo gListRepo) {
        this.gListRepo = gListRepo;
    }

    @Override
    @Transactional (readOnly = true)
    public List<groceryList> getAll() {return gListRepo.getAll();}

    @Override
    @Transactional (readOnly = true)
    public groceryList getGroceryListByID(int id) {return gListRepo.getGroceryListByID(id);}

    @Override
    @Transactional (readOnly = false)
    public void createGroceryList(groceryList newList) {gListRepo.createGroceryList(newList);}

    @Override
    @Transactional (readOnly = false)
    public void deleteGroceryListByID(int id) {gListRepo.deleteGroceryListByID(id);}
}
