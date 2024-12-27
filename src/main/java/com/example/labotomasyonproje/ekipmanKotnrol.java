package com.example.labotomasyonproje;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ekipmanKotnrol {

    @FXML
    private Button devamButton;

    @FXML
    private CheckBox eldivenCheck;

    @FXML
    private CheckBox gozlukCheck;

    @FXML
    private CheckBox onlukCheck;

    @FXML
    public void checkEt(MouseEvent event) {
        Alert alert;
        if (eldivenCheck.isSelected() && gozlukCheck.isSelected() && onlukCheck.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("deneyyapma.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) devamButton.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Deney Yapma");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eksik Giriş");
            alert.setHeaderText(null);
            alert.setContentText("Lutfen tum ekipmanlari giyin!");
            alert.showAndWait();
        }
    }
}
