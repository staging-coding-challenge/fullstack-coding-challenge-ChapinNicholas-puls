package com.ex.groceries.Repos;

import com.ex.groceries.models.groceryList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("groceryListRepoBean")
public class groceryListRepoImpli implements groceryListRepo {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<groceryList> getAll() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "From com.ex.groceries.models.groceryList";
        Query q = session.createQuery(hql);
        List<groceryList> gLists = (List<groceryList>) q.list();
        return gLists;
    }

    @Override
    public groceryList getGroceryListByID(int id) {
        return null;
    }

    @Override
    public void createGroceryList(groceryList newList) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(newList);
    }

    @Override
    public void deleteGroceryListByID(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        groceryList post = (groceryList) session.load(groceryList.class, id);
        try {
            session.delete(post);
        } catch (Exception e) {
        }
    }
}
