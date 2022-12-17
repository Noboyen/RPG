package com.example.rpg_v2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_ChooseHeroPage {


    @FXML
    private Button fight;

    @FXML
    private Button healer;

    @FXML
    private Button hunter;

    @FXML
    private Button mage;

    @FXML
    private Button retourButton;


    @FXML
    private Button warrior;

    @FXML
    void addHealer(ActionEvent event) {

    }

    @FXML
    void addHunter(ActionEvent event) {

    }

    @FXML
    void addMage(ActionEvent event) {

    }

    @FXML
    void addWarrior(ActionEvent event) {

    }

    //aller à la page Game
    @FXML
    protected void goGamePage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) retourButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Jeu");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }


    //aller à la page Fight
    @FXML
    protected void goFightPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) fight.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page Fight.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Fight");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    public void haveTable(SortEvent<TableView> tableViewSortEvent) {
    }


}