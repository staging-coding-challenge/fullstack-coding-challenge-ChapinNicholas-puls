package com.ex.groceries.Repos;

import com.ex.groceries.models.groceryListItem;
import com.ex.groceries.models.groceryList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("groceryListItemRepoBean")
public class groceryListItemsRepoImpli implements groceryListItemsRepo {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<groceryListItem> getAllItemsFromList(int listID) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "From com.ex.groceries.models.groceryListItem where 'listid' = :id";
        Query q = session.createQuery(hql);
        List<groceryListItem> gListItems = (List<groceryListItem>) q.list();
        return gListItems;
    }

    @Override
    public void addItemToList(int listID, String item, String itemType) {

    }

    @Override
    public void deleteItemFromList(int listID, int itemID) {

    }
}
