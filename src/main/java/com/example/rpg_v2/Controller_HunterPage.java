package com.example.rpg_v2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_HunterPage {


    @FXML
    private Button retourButton;

    //aller à la page Hunter
    @FXML
    protected void goHerosPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) retourButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Heros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Hunter");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }
}
