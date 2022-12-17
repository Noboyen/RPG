package com.example.rpg_v2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloController {


    @FXML
    private Button closeButton;

    @FXML
    private Button playButton;

    @FXML
    private Button herosButton;





    @FXML
    public void closeGame (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        stage.close();
        stage1.close();
    }

}


