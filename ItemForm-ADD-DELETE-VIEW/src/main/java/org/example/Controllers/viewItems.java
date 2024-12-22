package org.example.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.DateBase.DBConnection;
import org.example.Item.Item;

import java.util.Optional;

public class viewItems {
    public TableView itemsTable;


    public TableColumn colItemId;
    public TableColumn colItemName;
    public TableColumn colItemQty;
    public TableColumn colItemPrice;
    public TableColumn colItemDescription;

    public void loadTable(){

        ObservableList<Item> itemObservableList=FXCollections.observableArrayList();
        colItemId.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        colItemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colItemPrice.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemDescription.setCellValueFactory(new PropertyValueFactory<>("itemDecription"));

        DBConnection.getInstance().getConnection().forEach(obj -> {
            itemObservableList.add(obj);
        });

        itemsTable.setItems(itemObservableList);
    }

    public void viewItemReloadOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    public void deleteItemOnAction(ActionEvent actionEvent) {
        Item selectedItem = (Item) itemsTable.getSelectionModel().getSelectedItem();
        DBConnection.getInstance().getConnection().remove(selectedItem);
        loadTable();
        System.out.println(DBConnection.getInstance().getConnection().toString());

    }
}
