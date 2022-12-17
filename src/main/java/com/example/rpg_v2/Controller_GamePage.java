package com.example.rpg_v2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_GamePage {


    @FXML
    private Button menuButton;

    @FXML
    private Button startButton;

    //aller à la page Menu
    @FXML
    protected void goMenuPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) menuButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Jeu");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }


    //aller à la page Start the Game
    @FXML
    protected void goStartGamePage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) startButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page ChooseHero.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Choose Hero");
        stage.setScene(scene);
        stage1.close();
        Game.Play();


    }
}
