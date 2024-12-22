package org.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePage {
    public void addItemFormOnAction(ActionEvent actionEvent) {

        Stage stage=new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/addItem.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    public void viewItemFormOnAction(ActionEvent actionEvent) {

        Stage stage=new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/viewItems.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
