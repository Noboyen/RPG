package com.example.rpg_v2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_HerosPage {


    @FXML
    private Button hunterButton;

    @FXML
    private Button warriorButton;

    @FXML
    private Button mageButton;

    @FXML
    private Button healerButton;

    @FXML
    private Button menuButton;



    //aller à la page du Hunter
    @FXML
    protected void goHunterPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) hunterButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Hunter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros Page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    //aller à la page du Warrior
    @FXML
    protected void goWarriorPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) warriorButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Warrior.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros Page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    //aller à la page du Mage
    @FXML
    protected void goMagePage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) mageButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Mage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros Page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    //aller à la page du Healer
    @FXML
    protected void goHealerPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) healerButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Healer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros Page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    //aller à la page Menu
    @FXML
    protected void goMenuPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) menuButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros Page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

}


