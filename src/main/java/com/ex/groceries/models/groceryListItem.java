package com.ex.groceries.models;
import javax.persistence.*;
@Entity
@Table (name = "grocerylistitems")
public class groceryListItem {

    @Id
    @Column (name = "itemid", columnDefinition = "serial")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int itemid;

    @Column(name = "listid")
    private int listid;

    @Column(name = "itemtype", nullable = false)
    private int itemtype;

    @Column(name = "item", nullable = false)
    private int list;

    public groceryListItem(int listid, int itemtype, int list) {
        this.listid = listid;
        this.itemtype = itemtype;
        this.list = list;
    }

    public int getItemid() {return itemid;}

    public void setItemid(int itemid) {this.itemid = itemid;}

    public int getListid() {return listid;}

    public void setListid(int listid) {this.listid = listid;}

    public int getItemtype() {return itemtype;}

    public void setItemtype(int itemtype) {this.itemtype = itemtype;}

    public int getList() {return list;}

    public void setList(int list) {this.list = list;}
}
