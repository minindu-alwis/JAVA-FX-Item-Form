package org.example.Item;

import javafx.scene.control.TextField;

public class Item {

    private String itemId;
    private String itemName;
    private Integer qty;
    private Double itemPrice;
    private String itemDecription;

    public Item(String itemId, String itemName, Integer qty, Double itemPrice, String itemDecription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.qty = qty;
        this.itemPrice = itemPrice;
        this.itemDecription = itemDecription;
    }

    public Item(TextField itemId, TextField itemName, TextField itemQty, TextField itemPrice, TextField itemDesc) {

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDecription() {
        return itemDecription;
    }

    public void setItemDecription(String itemDecription) {
        this.itemDecription = itemDecription;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                ", itemPrice=" + itemPrice +
                ", itemDecription='" + itemDecription + '\'' +
                '}';
    }
}
