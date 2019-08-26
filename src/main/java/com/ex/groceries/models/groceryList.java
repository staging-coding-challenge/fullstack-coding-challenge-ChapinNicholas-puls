package com.ex.groceries.models;
import javax.persistence.*;


@Entity
@Table(name = "grocerylists")
public class groceryList {

    @Id
    @Column(name="listid", columnDefinition = "serial")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int listID;

    @Column(name="listname")
    private String listName;

    @Column (name="listdescription")
    private  String listDescription;

    public groceryList(String listName, String listDescription) {
        this.listName = listName;
        this.listDescription = listDescription;
    }

    public int getListID() {return listID;}

    public void setListID(int listID) {this.listID = listID;}

    public String getListName() {return listName;}

    public void setListName(String listName) {this.listName = listName;}

    public String getListDescription() {return listDescription;}

    public void setListDescription(String listDescription) {this.listDescription = listDescription;}
}
