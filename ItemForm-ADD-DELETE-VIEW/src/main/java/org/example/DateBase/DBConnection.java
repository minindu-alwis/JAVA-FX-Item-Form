package org.example.DateBase;

import org.example.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    private static DBConnection Instance;
    private List<Item> itemList;

        private DBConnection(){
            itemList=new ArrayList<>();
        }

        public List<Item> getConnection(){
            return itemList;
        }

        public static DBConnection getInstance(){

            return Instance==null?Instance=new DBConnection():Instance;
        }

    @Override
    public String toString() {
        return "DBConnection{" +
                "itemList=" + itemList +
                '}';
    }
}
