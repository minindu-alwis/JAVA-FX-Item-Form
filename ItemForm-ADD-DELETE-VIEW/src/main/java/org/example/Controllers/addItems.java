package org.example.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.DateBase.DBConnection;
import org.example.Item.Item;

public class addItems {

    public TextField itemId;
    public TextField itemName;
    public TextField itemQty;
    public TextField itemPrice;
    public TextField itemDesc;

    private static int idCount = 1;

    public void initialize() {
        updateNextItemId();
    }

    public void addItemOnAction(ActionEvent actionEvent) {
        Item t1=new Item("ITM" + String.format("%04d", idCount),
                itemName.getText(),
                Integer.valueOf(itemQty.getText()),
                Double.valueOf(itemPrice.getText()),
                itemDesc.getText())
                ;

        boolean isAdded=DBConnection.getInstance().getConnection().add(t1);

        if(isAdded){
            System.out.println("Item added successfully." + "Total items: " + DBConnection.getInstance().getConnection().size());
        }else{
            System.out.println("Adding Fail");
        }

        idCount++;
        updateNextItemId();
        clearInputFields();
        alterbox();
        System.out.println(DBConnection.getInstance().getConnection().toString());

    }

    private void updateNextItemId() {

        itemId.setText("ITM" + String.format("%04d", idCount));

    }

    private void clearInputFields() {
        itemName.clear();
        itemQty.clear();
        itemPrice.clear();
        itemDesc.clear();
    }

    public void itemFormColseOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void alterbox(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert Box");
        alert.setHeaderText(null);
        alert.setContentText("Showing an Alert in JavaFX!");
        alert.show();
    }
    
}
