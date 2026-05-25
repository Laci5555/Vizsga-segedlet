package com.example.login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HelloController {
    @FXML private ListView<String> lista1;
    @FXML private

    private FileChooser fc = new FileChooser();



    public void initialize(){
        fcOpen.setInitialDirectory(new File("./"));
        fcOpen.getExtensionFilters().add(new FileChooser.ExtensionFilter( "Csv fájlok", "*.csv"));
    }

    private void betolt(File fajl){
        Scanner be = null;
        try {
            be = new Scanner(fajl, "utf-8");
            lista1.getItems().clear();
            while (be.hasNextLine()) lista1.getItems().add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(be != null) be.close();
        }
    }


    //Fájl
    public void onKilepes() {
        Platform.exit();
    }

    public void onMentes() {
        File fajl = fcSave.showSaveDialog(lista1.getScene().getWindow());
        if(fajl != null) mentes(fajl);
    }

    private void mentes(File fajl){
        PrintWriter ki = null;
        try {
            ki = new PrintWriter(fajl, "utf-8");
            for (String sor : lista1.getItems()) ki.printf("%s\r\n", sor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(ki != null) ki.close();
        }
    }

    public void onMegnyitas() {
        File fajl = fcOpen.showOpenDialog(lista1.getScene().getWindow());
        if(fajl != null) betolt(fajl);
    }

    //Súgó
    public void onNevjegy() {
        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("Névjegy");
        info.setHeaderText(null);
        info.setContentText("Login v1.0.0\n(c) 2024");
        ((Stage)info.getDialogPane().getScene().getWindow()).getIcons().add(new Image(getClass().getResourceAsStream("icons/users.png")));
        info.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("icons/login.png"))));
        info.showAndWait();
    }
}