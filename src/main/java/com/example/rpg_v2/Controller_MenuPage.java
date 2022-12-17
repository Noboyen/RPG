package com.example.rpg_v2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_MenuPage {


    @FXML
    private Button closeButton;

    @FXML
    private Button herosButton;

    @FXML
    private Button playButton;



    //aller à la page du jeu
    @FXML
    protected void goGamePage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page du jeu");

        stage.setScene(scene);
        stage.show();
        stage1.close();

    }


    //aller à la page des Heros
    @FXML
    protected void goHerosPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) herosButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Heros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Heros");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }




    //fermer le jeu
    @FXML
    public void closeGame(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();


    }
}
